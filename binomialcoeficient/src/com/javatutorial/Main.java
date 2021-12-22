package com.javatutorial;
import java.io.DataInputStream;

public class Main {

    static int factorial(int n)
    {
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    public static void main(String[] args) throws Exception
    {
	// write your code here
        int num, r, nf,rf,nrf;
        double ncr;

        DataInputStream dis = new DataInputStream(System.in);

        System.out.println("Enter the num : ");
        num = Integer.parseInt(dis.readLine());  // input from user

        System.out.println("Enter the r : ");
        r = Integer.parseInt(dis.readLine());

        nf = factorial(num);
        rf = factorial(r);
        nrf = factorial(num-r);

        ncr = nf / (rf * nrf);

        System.out.println("Binomial Coefficient : "+ncr);
    }
    // ncr = n! /(r! * (n - r)!)
}
