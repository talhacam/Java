package AaPractice.day05;

import java.util.Scanner;

public class Q04_MethodCreation {

    /* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String s = scan.nextLine();

        System.out.println("String'in tersi :"+ reverseString(s));

        reverseString(s);
    }

    private static String reverseString(String s) {

        String reversed= "";
        for (int i = s.length()-1; i>=0; i--) {
            reversed+= s.charAt(i);
        }
        return reversed;
    }
}