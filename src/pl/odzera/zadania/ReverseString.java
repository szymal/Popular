package pl.odzera.zadania;

import java.util.Scanner;

/**
 * Created by kamilszymczak on 20.09.2016.
 */
public class ReverseString {
    public static void main(String args[]){
        String word;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write word: ");
        word = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(word);
        System.out.println(stringBuffer.reverse());
    }
}
