import java.util.*;
class A
{
   void display() throws InvalidAgeException
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your age:");
      int age=sc.nextInt();
      if(age<=18)
      {
         throw new InvalidAgeException("aaa");
      }
      else 
      {
         System.out.println("Your age is: "+age);
      }
   }
}
class demo19
{
   public static void main(String args[])
    {
       try
       {
          A a=new A();
          a.display();
       }
       catch(InvalidAgeException ia)
       {
          System.out.println("Enter valid age: "+ ia.getMessage());
       }
    }
}

class InvalidAgeException extends Exception
{
    InvalidAgeException(String x)
    {
       super(x);
    }
}