package com.javatutorial;
import java.io.DataInputStream;

abstract class Shape
{
    int a,b;
    float ar;

    abstract void getData()throws Exception;
    abstract void area();
}

class Circle extends Shape
{
    void getData() throws Exception
    {
        DataInputStream dis=new DataInputStream(System.in);

        System.out.print("Enter the Radius: ");
        a = Integer.parseInt(dis.readLine());
    }

    void area()
    {
        ar = 3.141596F * a * a;
        System.out.println("\n Area of Circle = "+ar);
    }
}
class Rectangle extends Shape
{
    void getData()throws Exception
    {
        DataInputStream dis=new DataInputStream(System.in);

        System.out.print("Enter the Length: ");
        a = Integer.parseInt(dis.readLine());

        System.out.print("Enter the Breadth: ");
        b = Integer.parseInt(dis.readLine());
    }

    void area()
    {
        ar = a * b;
        System.out.println("\n Area of Rectangle = "+ar);
    }
}
class Triangle extends Shape
{
    void getData()throws Exception
    {
        DataInputStream dis=new DataInputStream(System.in);

        System.out.print("Enter the Base: ");
        a = Integer.parseInt(dis.readLine());
        System.out.print("Enter the Height: ");
        b = Integer.parseInt(dis.readLine());
    }

    void area()
    {
        ar = 0.5F * a * b;
        System.out.println("\n Area of Triangle = "+ ar);
    }
}

public class Main {

    public static void main(String[] args)throws Exception
    {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();

        c.getData();
        t.getData();
        r.getData();

        c.area();
        t.area();
        r.area();
    }
}