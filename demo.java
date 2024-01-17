import java.util.Scanner;

class A
{
   private int x=10;
   A()
   {
     System.out.println("HI A");
   }
}

class B extends A
{
   int x=30;
   B()
   {
     System.out.println("Child x is:"+x);
     System.out.println("Parent x is:"+super.x);
   }
}

public class demo
{
   public static void main(String args[])
   {
     B b=new B();
   }
}