import java.util.*;
class A extends Thread
{
   public void run()
   {
   try
   {
      int ss=0,mm=0,hr=0;
      for(int i=0;i<=3700;i++)
      {
         ss++;
         if(ss==60)
         {
           ss=0;
           mm++;
         }
         if(mm==60)
         {
           mm=0;
           hr++;
         }
          System.out.print("\r");
          System.out.print(hr+":"+mm+":"+ss);
          Thread.sleep(100);
      }
   }
   catch(Exception e)
   {
   }
   }
}
class demo21
{
   public static void main(String args[])
   {
     A a=new A();
     a.start();
   }
}