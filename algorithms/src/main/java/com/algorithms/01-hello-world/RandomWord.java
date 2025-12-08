import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
  public static void main(String[] args) {
    int index = 0;
    String championWord = "";

    while (!StdIn.isEmpty()) {
      String tempName = StdIn.readString();
      boolean isNewChampion = StdRandom.bernoulli(1.0 / (1.0 + index));
      if (isNewChampion) {
        championWord = tempName;
      }
      index++;
    }
    StdOut.print(championWord);
  }
}