import java.util.*;
import java.io.*;
import java.sql.*;
class A
{
   void abc() throws FileNotFoundException,SQLException
   {
      for(int age=0;age<=20;age++)
      {
         if(age==18) throw new ArithmeticException();
        // if(age==15) throw new InputMismatchException();
         //if(age==10) throw new FileNotFoundException();
         //if(age==8) throw new SQLException();

          System.out.println("I: "+age);
      }
   }
}
class demo18
{
    public static void main(String args[])
    {
       try
       {
          A a=new A();
          a.abc();
       } 
       catch(Exception e)
       {
         System.out.println("ArithmeticException Found:");
       }
       catch(InputMismatchException ime)
       {
         System.out.println("InputMismatchException Found:");
       }
       catch(FileNotFoundException fnfe)
       {
         System.out.println("FileNotFoundException Found:");
       }
       catch(SQLException sqle)
       {
         System.out.println("SQLException Found:");
       }
    }
}