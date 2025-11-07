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
    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner file = new Scanner(System.in);
        int n = file.nextInt();
        file.close();
        System.out.println("Number of elements: " + n);
    }
}
