package com.javatutorial;
import java.io.DataInputStream;

class fibbonacci
{
    int fib(int x)
    {
        if(x<=1)
        {
            return x;
        }
        return fib(x-1)+fib(x-2);
    }
}
public class Main {

    // wap to generate a fibbonacci serise using functions
    public static void main(String[] args) throws Exception
    {
	// write your code here

        DataInputStream dis = new DataInputStream(System.in);

        System.out.println("Enter the Number : ");
        int a= Integer.parseInt(dis.readLine());

        // create the class object first
        fibbonacci f = new fibbonacci();
        System.out.println("fibonacci series of "+ a +" is "+f.fib(a));

    }
}
