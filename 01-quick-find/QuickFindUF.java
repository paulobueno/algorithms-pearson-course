/**
 * Files downloaded at:
 *     https://algs4.cs.princeton.edu/15uf/tinyUF.txt
 *     https://algs4.cs.princeton.edu/15uf/mediumUF.txt
 *     https://algs4.cs.princeton.edu/15uf/largeUF.txt
 * Execute:
 *     `java QuickFind < file.txt`
 *
 */
import java.util.Scanner;

public class QuickFindUF {
    /**
     * The array that stores the index each position is linked
     */
    private int[] array;
    /**
     * The number of elements to be analized
     */
    private int count;

    /**
     * The constructor
     */
    public QuickFindUF(int n) {
        count = n;
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
    }

    private static int find(int n) {
        return int[n];
    }

    private void validate(int n) {
        return;
    }

    private void union(int first, int second) {
        validate(first);
        validate(second);
        int firstID = array[first];
        int secondID = array[second];

        if (firstID == secondID) {
            return;
        }



    }

    public static void main(String[] args) {
        Scanner file = new Scanner(System.in);
        int n = file.nextInt();
        QuickFindUF uf = new QuickFindUF(n);
        while (file.hasNext()) {
            int first = file.nextInt();
            int second = file.nextInt();
            if (uf.find(first) != uf.find(second)) {
                uf.union(first, second);
                System.out.println("Joining " + first + " and " + second);
            }
        }
        file.close();
        System.out.println("Number of elements: " + n);
    }
}
