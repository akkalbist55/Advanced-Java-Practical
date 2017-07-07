class arraydemo
{
public static void main(String args[])
{
int m[];
m=new int[10];
m[0]=10;
m[1]=10;
m[2]=10;
m[3]=10;
m[4]=10;
m[5]=10;
m[6]=10;
m[7]=10;
m[8]=10;
m[9]=10;
int i,sum=0;
for(i=0; i<10;i++)
{
sum=sum+m[i];
}
System.out.println("\n Sum of all numbers is"+sum);
}
}

