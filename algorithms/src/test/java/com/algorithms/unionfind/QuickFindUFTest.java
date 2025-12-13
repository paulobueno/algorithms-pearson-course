package com.algorithms.unionfind;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class QuickFindUFTest {
  private final static String FILES_DIRECTORY = "src/test/resources";
  private final static String BASE_URL = "https://algs4.cs.princeton.edu/15uf/";
  private final static List<String> fileNames = List.of("tinyUF.txt", "mediumUF.txt", "largeUF.txt");

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

  @Test
  void dummyTest() {
    System.out.println("HERE IS MY TEST");
  }

//  @ParameterizedTest
//  @ValueSource(strings = {"tinyuf.txt"});
//  void mainTest(String fileName) {
//  }
}
