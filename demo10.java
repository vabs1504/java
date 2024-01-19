import java.util.Scanner; 

abstract class Bank
{
   abstract void roi();
   void ans()
   {
     System.out.println("9%");
   }
}

class sbi extends Bank
{
   void roi()
   {
     System.out.println("7%");
   }
}

class demo10
{
   public static void main(String args[])
   {
     sbi s=new sbi();
     s.ans();
   }
}