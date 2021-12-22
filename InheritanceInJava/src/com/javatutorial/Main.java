package com.javatutorial;


class Base
{
    public void show()
    {
        System.out.println("Hello From Base Class!!");
    }
}

class Derived extends Base   // extends --> it uses the connect the class
{
    public void display()
    {
        System.out.println("Hello From Derived Class!!");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Derived dv = new Derived();  // create the class object

        dv.show();
        dv.display();
    }
}

/*
Function Overloading

package com.javatutorial;

class Base
{
    public void show()
    {
        System.out.println("Hello From Base Class!!");
    }
}

class Derived extends Base   // extends --> it uses the connect the class
{
    public void show()
    {
        System.out.println("Hello From Derived Class!!");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Derived dv = new Derived();  // create the class object

        dv.show();
    }
}
*/

/*

method overriding

package com.javatutorial;


class Base
{
    public void show()
    {
        System.out.println("Hello From Base Class!!");
    }
}

class Derived extends Base   // extends --> it uses the connect the class
{
    public void show()
    {
        super.show();
        System.out.println("Hello From Derived Class!!");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Derived dv = new Derived();  // create the class object

        dv.show();
        dv.show();
    }
}
 */