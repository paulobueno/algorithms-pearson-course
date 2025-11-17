import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
  public static void main(String[] args) {
    Double championProb = 0.0;
    Double tempProb;
    String tempName;
    String championName = null;

    while (!StdIn.isEmpty()) {
      tempName = StdIn.readLine();
      tempProb = StdRandom.uniformDouble();
      if (championProb < tempProb) {
        championProb = tempProb;
        championName = tempName;
      }
    }
    StdOut.print(championName);
  }
}