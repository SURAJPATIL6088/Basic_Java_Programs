package com.javatutorial;
import java.io.DataInputStream;

public class Main {

    public static void main(String[] args) {

        int a,b,c;
        DataInputStream dis = new DataInputStream(System.in);
        try
        {
            System.out.print("Enter first value :");
            a = Integer.parseInt(dis.readLine());

            System.out.print("Enter second value :");
            b = Integer.parseInt(dis.readLine());

            c = a / b;

            System.out.println("Division = " + c);
        }
        catch(ArithmeticException e2)
        {
            System.out.println("Denominator should not be ZERO");
        }

        catch(Exception e1)
        {
            System.out.println("Please enter numeric value without Space and any special character");
        }
        finally
        {
            System.out.println("Have a good day");
        }
    }
}
