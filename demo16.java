import java.util.*;
class demo16
{
    public static void main(String args[])
   {
       m1();
   }
   static void m1()
   {
      m2();
      System.out.println("M1 method ...");
   }
   static void m2()
   {
      try
      {
      System.out.println("M2 method ...");
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter A:");
      int a=sc.nextInt();
      System.out.print("Enter B:");
      int b=sc.nextInt();
      int c=a/b;
      System.out.println("Result is :"+c);
      }
      catch(InputMismatchException ime)
      {
        System.out.println("Enter an integer");
      }
      catch(ArithmeticException ae)
      {
        System.out.println("Cannot divide by zero");
      }
       finally
       {
          System.out.println("Thank you..");
       }
   }

}
