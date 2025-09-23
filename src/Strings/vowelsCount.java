package Strings;

import java.net.Socket;
import java.util.Scanner;

public class vowelsCount {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String word = sc.next();

    int vowel = 0;
    int consonant = 0;

    for (int i = 0; i < word.length(); i++) {
      char c = (word.charAt(i));
      if (c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i') {
        vowel++;
      } else
        consonant++;
    }
    System.out.println("Vowel: " + vowel);
    System.out.println("Consonants: " + consonant);

  }

}
