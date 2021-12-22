package com.javatutorial;
import java.io.DataInputStream;

public class Main {

    public static void main(String[] args) throws Exception
    {
	// write your code here
        int n ,i, num, m;
        int arm = 0;
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter the Number : ");
        n = Integer.parseInt(dis.readLine());

        num = n;
        do
        {
            m = n%10;
            arm = arm+(m*m*m);
            n = n/10;
        }while(n != 0);

        if( arm == num)
        {
            System.out.println(num + " is a Armstrong Number");
        }
        else
        {
            System.out.println(num + " is Not a Armstrong Number");
        }

    }
}
