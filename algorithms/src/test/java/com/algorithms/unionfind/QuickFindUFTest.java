package com.algorithms.unionfind;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

class QuickFindUFTest {
  private Path testFile;

  @BeforeEach
  void setUp() throws Exception {
    String remoteUrl = "https://algs4.cs.princeton.edu/15uf/tinyUF.txt";
    testFile = Paths.get("tinyUF.txt");
  }

  @Test
  public tinyTest() {
    var myImp = new QuickFindUF(10);
    var officialImp = new edu.princeton.cs.algs4.QuickFindUF(10);
  }
}
