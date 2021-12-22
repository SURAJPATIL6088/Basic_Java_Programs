package com.javatutorial;
import java.io.DataInputStream;

class Sample
{
    int a, b;

    Sample()
    {
        a = 10;
        b = 20;
    }

    Sample(int x, int y)
    {
        a = x;
        b = y;
    }
    void putData()
    {
        System.out.println( a + "  and  " + b);
    }
}

public class MyClass
{
    public static void main(String args[]) throws Exception
    {
        Sample s1 = new Sample();
        Sample s2 = new Sample(45, 65);
        Sample s3;

        s3 = s2;
        System.out.print("\n Value of Object s1 = ");
        s1.putData();

        System.out.print("\n Value of Object s2 = ");
        s2.putData();

        System.out.print("\n Value of Object s3 = ");
        s3.putData();
    }
}