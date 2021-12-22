package com.javatutorial;
import java.io.DataInputStream;


 class FactorialExample2 {
    static int factorial(int num){
        if (num == 0)
            return 1;
        else
        {
            return(num * factorial(num-1));
        }
    }
public class Main {
    public static void main(String[] args) throws Exception {
        // write your code here

        DataInputStream dis = new DataInputStream(System.in);
        int num, fact;

        System.out.println("Enter the Num : ");
        num = Integer.parseInt(dis.readLine());

        fact = factorial(num);

        System.out.println("Factorial of " + num + " is " + fact);
    }
}

