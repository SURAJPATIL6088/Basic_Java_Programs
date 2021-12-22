package com.javatutorial;
import java.io.DataInputStream;

public class Main {

    public static void main(String[] args) throws Exception
    {
	// write your code here

        String s1, s2;
        DataInputStream dis = new DataInputStream(System.in);

        System.out.println("Enter the string : ");
        s1 = dis.readLine();

        StringBuffer sb = new StringBuffer(s1);
        sb.reverse();

        s2 = sb.toString();

        if(s1.equals(s2))
        {
            System.out.println("String is Palindrome !!");
        }
        else
        {
            System.out.println("String is not palindrome !!");
        }
    }
}
