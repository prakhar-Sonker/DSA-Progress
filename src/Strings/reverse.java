package Strings;

import java.util.Scanner;

public class reverse {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String word = sc.next();

    // hello
    // String str = "";
    StringBuilder s = new StringBuilder(word);
    s.reverse();
    System.out.println(s);

    // for (int i = word.length() - 1; i >= 0; i--) {
    // char c = word.charAt(i);
    // str += c;
    // }
    // System.out.println(str);
  }

}
