package com.javatutorial;
import java.io.DataInputStream;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        String str;
        int len, i, j;

        DataInputStream dis = new DataInputStream(System.in);

        System.out.print("Enter any String : ");
        str = dis.readLine();

        len = str.length();
        j = len - 1;

        for (i = 0; i < (len / 2); i++) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println(str + " String is not Palindrome...");
                System.exit(0);
            }
            j--;
        }
        System.out.println(str + " String is Palindrome...");
    }
}