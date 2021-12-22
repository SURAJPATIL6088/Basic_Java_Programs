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
        System.out.println("Roll Number : "+rno+"\nName : "+nm+"\nAvg Marks :"+avg);
    }
}

public class Main {

    public static void main(String[] args) throws Exception
    {
	// write your code here
        student s1 = new student();

        s1.getData();
        s1.putData();
    }
}
