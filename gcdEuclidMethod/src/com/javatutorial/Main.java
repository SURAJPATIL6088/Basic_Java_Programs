package com.javatutorial;
import java.io.DataInputStream;

class Eclid
{
    int gcd(int x, int y)
    {
        int r = x % y;

        while(r != 0)
        {
            x = y;
            y = r;
            r++;
        }
        return y;
    }
}

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        int a, b, g;

        DataInputStream dis = new DataInputStream(System.in);

        // create the class object
        Eclid E = new Eclid();

        System.out.println("Enter the A : ");
        a = Integer.parseInt(dis.readLine());

        System.out.println("Enter the B : ");
        b = Integer.parseInt(dis.readLine());

        if(a >= b)
        {
            g = E.gcd(a,b);
        }
        else
        {
            g = E.gcd(b,a);
        }

        System.out.println("G.C.D of "+ a +" And "+ b +" is "+ g);
    }
}
