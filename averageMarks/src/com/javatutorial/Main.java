package com.javatutorial;

public class Main {

    public static void main(String[] args) {
        //wap which will acc       ept marks of 5 subjects and based
        //on the average marks he got it will display the result

        //60 and 75  first class
        //60 and 50 se
        //40 fai
        //50 and 40 pass class

        int sub1, sub2, sub3, sub4, sub5;
        float average = 0, sum =0;

        sub1 = Integer.parseInt(args[0]);
        sub2 = Integer.parseInt(args[1]);
        sub3 = Integer.parseInt(args[2]);
        sub4 = Integer.parseInt(args[3]);
        sub5 = Integer.parseInt(args[4]);

        sum = sub1 + sub2 + sub3 + sub4 + sub5 ;
        average = sum /5;

        if( average >= 75)
        {
            System.out.println("Distinction");
        }
        else if ( average < 75 && average >= 60 )
        {
            System.out.println("First Class ");
        }
        else if ( average < 60 && average >= 50 )
        {
            System.out.println("Second Class ");
        }
        else if ( average < 50 && average >= 40)
        {
            System.out.println("Pass class ");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
