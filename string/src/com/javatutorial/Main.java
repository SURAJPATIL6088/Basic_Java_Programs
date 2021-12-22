package com.javatutorial;

public class Main {

    public static void main(String[] args) {
	// write your code here

       /*
        output ; HeLl0
        public class StringDemo
        {

            public static void main(String args[])
            {
                char[] a = { 'H', 'e', 'L', 'l', 'O', '.' };

                String str = new String(a);
                System.out.println( str );
            }
        }
        */

        /*
        String Concat
public class StringDemo
{
   public static void main(String args[])
   {
      String str1 = " Good Morning";
      String str2 = " Hello Friends !!!!";

      String str3 = str2 + str1;

      String str4 = str1.concat(str2);

      System.out.println(str3);
      System.out.println(str4);

   }
}
         */

        /*
        public class StringDemo
{
   public static void main(String args[])
   {
      String str1 = "AbCDEF";
      String str2 = "ABcdEF";

      int x = str1.compareToIgnoreCase(str2);

      if (x == 0)
      {
          System.out.println("Both Strings are exactly same");
      }
      else
      {
          System.out.println("Both Strings are different");
      }

      System.out.println("Value of x = " + x);
    }
}
         */

        /*
        public class StringDemo
{
   public static void main(String args[])
   {
      char[] x = { 'h', 'e', 'l', 'l', 'o', '.' };

      String s1 = "Good Morning";
      String s2 = new String("Where are you???");
      String s3 = new String(x);

      System.out.println( s1 );
      System.out.println( s2 );
      System.out.println( s3 );
   }
}
         */

        /*
        public class StringDemo
{
   public static void main(String args[])
   {
      String s1 = "AbCdEf";
      byte x[] = new byte[s1.length()];

      x = s1.getBytes();


      System.out.println("Your String is " + s1 );
      System.out.println("ASCII values of all characters ");

      for(int i = 0; i < s1.length(); i++ )
      {
          System.out.print("   " + x[i]);
      }
   }
}
         */

        /*
        public class StringDemo
{
   public static void main(String args[])
   {
      String s1 = "AbCdEfGHIJKLMNOP";
      char x[] = new char[s1.length()];

      s1.getChars(2,7, x, 0);


      System.out.print("Your String is " + s1 );
      System.out.print("\n Sub String is - " );

      for(int i = 0; i < s1.length(); i++ )
      {
          System.out.print(x[i]);
      }
   }
}
         */

        /*
        public class StringDemo
{
   public static void main(String args[])
   {
      String s1 = "ABCdEfGHIJKL";
      String s2 = "ABcDEFGHIJKL";

      int x = s1.compareTo(s2);

      if (x == 0)
      {
          System.out.print(" Both Strings are same");
      }
      else
      {
          System.out.print(" Both Strings are different");
      }

      System.out.println("\n Value of x = "+ x);
   }
}
         */

        /*
        public class StringDemo
{
   public static void main(String args[])
   {
      String s1 = "ABCdEfGHIJKL";
      String s2 = "ABcDEFGHIJKL";

      int x = s1.compareToIgnoreCase(s2);

      if (x == 0)
      {
          System.out.print(" Both Strings are same");
      }
      else
      {
          System.out.print(" Both Strings are different");
      }

      System.out.println("\n Value of x = "+ x);
   }
}
         */
    }
}
