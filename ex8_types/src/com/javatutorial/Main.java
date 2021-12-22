package com.javatutorial;
import java.io.DataInputStream;

class Student
{
    int rollno;
    String name;
    void getInfo()throws Exception
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.print("Enter the Roll No: ");
        rollno=Integer.parseInt(dis.readLine());
        System.out.print("Enter the Name: ");
        name=dis.readLine();
    }
    void putInfo()
    {
        System.out.println("Name Of Student: "+name);
        System.out.println("Roll No: "+rollno);
    }
}
class Marks extends Student
{
    float m1,m2,m3;
    void getMarks()throws Exception
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.print("Enter Marks for Subject 1: ");
        m1=Float.parseFloat(dis.readLine());
        System.out.print("Enter Marks for Subject 2: ");
        m2=Float.parseFloat(dis.readLine());
        System.out.print("Enter Marks for Subject 3: ");
        m3=Float.parseFloat(dis.readLine());
    }
    void putMarks()
    {
        System.out.println("Marks for Subject 1 is "+m1);
        System.out.println("Marks for Subject 2 is "+m2);
        System.out.println("Marks for Subject 3 is "+m3);
    }
}

interface Sports
{
    int score = 8;
    String game = "Cricket";
}

class Result extends Marks implements Sports {

    float avg;

    void putGame()
    {
        System.out.println("Name Of Game: "+game);
        System.out.println("Score: "+score);
    }

    void getAvg() {
        avg = (m1 + m2 + m3) / 3;
    }
    void showAvg()
    {
        System.out.println("\nAverage Marks is "+avg);
    }
}

public class Main {

    public static void main(String[] args) throws Exception{

        Result r=new Result();
        r.getInfo();
        r.getMarks();
        r.getAvg();
        r.putInfo();
        r.putMarks();
        r.showAvg();
        r.putGame();
    }
}

