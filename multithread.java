package bsccsit7;
public class multithread extends Thread{
String threadname;
multithread(String tname)
{
threadname=tname;
}
public void run()
{
try{
System.out.println("\n Thread is started " +threadname);
for(int i=0;i<5;i++)
{
System.out.println(i + " -> "+threadname);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.println("interrupted is occured");
}
}
public static void main(String s[])
{
multithread t1=new multithread("Indreni");
multithread t2=new multithread("College");
multithread t3=new multithread("BH-10");
t1.start();
t2.start();
t3.start();
}
}
