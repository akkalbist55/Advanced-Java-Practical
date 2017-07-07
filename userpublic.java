t a,b;
public void get()
{
a=10;
b=20;
}private void display()
{
System.out.println("values are : "+a+ " "+b);
}
public static void main(String args[])
{
user pobj=new user();
pobj.uget();
pobj.udisplay();
}
}
class user
{
userpublic obj;
public void uget()
{
obj=new userpublic();
obj.get();
}
public void udisplay()
{
//error can not access this member bcz of private
obj.display();
}
}
