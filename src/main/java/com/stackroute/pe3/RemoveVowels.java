//a program to set up an array of places, Loop round and remove the vowels.

package com.stackroute.pe3;
import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {


        String[] strArray1 = new String[11];
        System.out.println("enter no of words");
        Scanner input = new Scanner(System.in); //scanner function
        String str;
        int words = input.nextInt();
        System.out.println("enter words");
        for (int i = 0; i<=words; i++) {
            strArray1[i] = input.nextLine(); //scanning letters into an array

            str = strArray1[i].replaceAll("[aeiouAEIOU]", "");
            System.out.println(str);
        }

    }
}
