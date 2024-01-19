import java.util.*;
class A extends Thread
{
   public void run()
   {
       try
       {
       for(int i=0;i<=10;i++)
       {
         System.out.println("I :"+i);
         Thread.sleep(1000);
       }
       }
       catch(Exception e)
       {
         
       }
   }
}
class B extends Thread
{
   public void run()
   {
       try
       {
       for(int j=0;j<=5;j++)
       {
         System.out.println("    J :"+j);
         Thread.sleep(2000);
       }
       }
       catch(Exception e)
       {
         
       }
   }
}
class C extends Thread
{
   public void run()
   {
       try
       {
       for(int k=0;k<=20;k++)
       {
         System.out.println("         K :"+k);
         Thread.sleep(500);
       }
       }
       catch(Exception e)
       {
         
       }
   }
}
class demo20
{
   public static void main(String args[])
   {
      A a=new A();
      a.start();
      B b=new B();
      b.start();
      C c=new C();
      c.start();
   }
}