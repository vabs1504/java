import java.util.Scanner;

class Emp
{
   int age,id,x,b;
   double salary;
   String name,designation;
   Emp()
   {
      
   }
   void create()
   {
      x=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your name:");
      name=sc.nextLine();
      System.out.println("Enter your id:");
      id=sc.nextInt();
      System.out.println("Enter your age:");
      age=sc.nextInt();
   }
   void display()
   {
     if(x==0)
     {
        System.out.println("Record not found");
     }
     else 
     {
     System.out.println("Name is:"+name);
     System.out.println("Id is:"+id);
     System.out.println("Age is:"+age);
     System.out.println("Salary is:"+salary);
     System.out.println("Designation is:"+designation);
     }
   }

     void incre(double a)
     {
        if(b==0)
        salary=salary*a;
        
        b=1;
     }
}

class Developer extends Emp
{
   Developer()
   {
     salary=50000;
     designation="Developer";
   }
}

class Clerk extends Emp
{
   Clerk()
   {
     salary=20000;
     designation="Clerk";
   }
}

class Manager extends Emp
{
   Manager()
   {
     salary=90000;
     designation="Manager";
   }
   
}

class Tester extends Emp
{
   Tester()
   {
     salary=25000;
     designation="Tester";
   }
}

public class project 
{
   public static void main(String args[])
   {
     int x=0;
     Developer d=new Developer();
     Clerk c=new Clerk();
     Manager m=new Manager();
     Tester t=new Tester();
     while(x!=4)
     {
        System.out.println("1 for create:");
        System.out.println("2 for display:");
        System.out.println("3 for update");
        System.out.println("4 for exit");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        if(x==1)
        {
        System.out.println("1 for Developer:");
        System.out.println("2 for Clerk:");
        System.out.println("3 for Manager:");
        System.out.println("4 for Tester:");
        System.out.println("5 for Exit");
        int y;
        y=sc.nextInt();
         if(y==1)
         {
           d.create();
         }
         else if(y==2)
         {
            c.create();
         }
         else if(y==3)
         {
            m.create();
         }
         else if(y==4)
         {
           t.create();
         }
        }
        else if(x==2)
        {
          System.out.println("1 for Developer:");
        System.out.println("2 for Clerk:");
        System.out.println("3 for Manager:");
        System.out.println("4 for Tester:");
        System.out.println("5 for Exit");
        int y;
        y=sc.nextInt();
        if(y==1)
        {
           d.display();
        }
        else if(y==2)
        {
          c.display();
        }
        else if(y==3)
        {
            m.display();
        }
        else if(y==4)
        {
           t.display();
        }
        }
        else if(x==3)
        {
           System.out.println("1 for Developer:");
        System.out.println("2 for Clerk:");
        System.out.println("3 for Manager:");
        System.out.println("4 for Tester:");
        System.out.println("5 for Exit");
        int y;
        y=sc.nextInt();
        if(y==1)
        {
           d.incre(1.15);
        }
        else if(y==2)
        {
          c.incre(1.05);
        }
        else if(y==3)
        {
            m.incre(1.20);
        }
        else if(y==4)
        {
           t.incre(1.10);
        }
        }
     }
   }
}