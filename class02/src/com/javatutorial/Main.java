package com.javatutorial;
import java.io.DataInputStream;

class student
{
    int rno;
    String nm;
    float avg;

    void getData() throws Exception
    {
        DataInputStream dis = new DataInputStream(System.in);

        System.out.println("\nEnter the Roll Number : ");
        rno = Integer.parseInt(dis.readLine());

        System.out.println("\nEnter the Name : ");
        nm = (dis.readLine());

        System.out.println("\nEnter the avg Marks : ");
        avg = Float.parseFloat(dis.readLine());
    }

    void putData() throws Exception
    {
        System.out.println(rno+" \t\t\t"+nm+"\t\t\t"+avg);
    }
}

public class Main {

    public static void main(String[] args) throws Exception
    {
        // write your code here
        int n;
        DataInputStream dis = new DataInputStream(System.in);

        System.out.println("Enter the Number of the student : ");
        n = Integer.parseInt(dis.readLine());

        student s[];

        s = new student[n];
        for(int i =0; i<n; i++)
        {
            s[i] = new student();

            System.out.println("\nFor Student "+(i+1));
            s[i].getData();
        }
        System.out.println("Roll No \t Name \t Average Marks");
        System.out.println("--------------------------------------");

        for(int i =0; i<n; i++)
        {
            s[i].putData();
        }
    }
}
