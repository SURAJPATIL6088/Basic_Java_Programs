package com.javatutorial;

public class Main {

    // check the three number which one is greather
    public static void main(String[] args) {

        int a, b, c;

        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);

        if( a == b && b == c)
        {
            System.out.println("all are Equal");
        }
        else if( a> b && a> c)
        {
            System.out.println(a + " a is Greather ");
        }
        else if( b> a && b>c)
        {
            System.out.println(b + " b is Greather ");
        }
        else
        {
            System.out.println(c + " c is Greather ");
        }
    }
}
