package com.javatutorial;
import java.io.DataInputStream;

class sample{
    int a, b;
    sample()
    {
        a =10 ;
        b =20;
    }
    sample(int x, int y)
    {
        a =x;
        b =y;
    }
    void put()
    {
        System.out.println(a+" and "+b);
    }
}
public class Main {

    public static void main(String[] args)throws Exception
    {
	// write your code here
        sample s1 = new sample();
        sample s2 = new sample(45,65);
        sample s3;
        s3 = s2;
        System.out.println("value of object s1 = ");
        s1.put();
        System.out.println("value of object s2 = ");
        s2.put();
        System.out.println("value of object s3 = ");
        s3.put();
    }
}
