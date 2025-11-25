package com.algorithms.unionfind;

import edu.princeton.cs.algs4.StdIn;
import java.util.Arrays;

public class QuickFindUF {
  private int[] id;

  public QuickFindUF(int N) {
    id = new int[N];
    for (int i = 0; i < N; i++) {
      id[i] = i;
    }
  }

  public void union(int p, int q) {
    int pid = id[p];
    int qid = id[q];
    for (int i = 0; i < id.length; i++) {
      if (id[i] == pid) {
        id[i] = qid;
      }
    }
  }

  public boolean connected(int p, int q) {
    return id[p] == id[q];
  }

  public static void main(String[] args) {
    int N = StdIn.readInt();
    var inst = new QuickFindUF(N);
    while (!StdIn.isEmpty()) {
      int p = StdIn.readInt();
      int q = StdIn.readInt();
      if (!inst.connected(p, q)) {
        System.out.println("Connecting " + p + " and " + q);
        inst.union(p, q);
      }
    }
    System.out.println(Arrays.toString(inst.id));
  }
}
