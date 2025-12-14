package com.algorithms.unionfind;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuickFindUFTest {
  private final static String FILES_DIRECTORY = "src/test/resources";
  private final static String BASE_URL = "https://algs4.cs.princeton.edu/15uf/";
  private final static List<String> fileNames = List.of(
      "tinyUF.txt",
      "mediumUF.txt",
      "largeUF.txt"
  );

  @BeforeAll
  static void downloadFiles() {
    for (String fileName : fileNames) {
      Path filePath = Paths.get(FILES_DIRECTORY).resolve(fileName);
      if (!Files.exists(filePath)) {
        try {
          URL url = new URL(BASE_URL + fileName);
          InputStream in = url.openStream();
          Files.copy(in, filePath);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }

  static List<String> getFileNames() {
    return fileNames;
  }

  private int[] getResult(Path inputFilePath, Class<?> testClass) throws Exception {
    Scanner scanner = new Scanner(inputFilePath.toFile());

    int n = scanner.nextInt();
    Constructor<?> constructor = testClass.getConstructor(int.class);
    Object uf = constructor.newInstance(n);
    Field idField = testClass.getDeclaredField("id");
    idField.setAccessible(true);
    Method findMethod = testClass.getMethod("find", int.class);
    Method unionMethod = testClass.getMethod("union", int.class, int.class);

    while (scanner.hasNextInt()) {
      int p = scanner.nextInt();
      int q = scanner.nextInt();

      int pRoot = (int) findMethod.invoke(uf, p);
      int qRoot = (int) findMethod.invoke(uf, q);

      if (pRoot == qRoot) continue;
      unionMethod.invoke(uf, p, q);
    }

    scanner.close();
    return (int[]) idField.get(uf);
  }



  @ParameterizedTest
  @MethodSource("getFileNames")
  void mainTest(String fileName) throws Exception {
    Path filePath = Paths.get(FILES_DIRECTORY, fileName);
    System.out.println("Running tests with file: " + fileName);
    int[] myResuts = getResult(filePath, QuickFindUF.class);
    int[] reResuts = getResult(filePath, edu.princeton.cs.algs4.QuickFindUF.class);
    assertArrayEquals(myResuts, reResuts);
  }
}
