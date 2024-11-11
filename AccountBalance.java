package Mypack;
class Balance{
String name;
double Balance1;
Balance(String s,double d)
{
name=s;
Balance1=d;
}
void displayshow()
{
if(Balance1<=0)
{ System.out.println("No Balance");}
if(Balance1>0)
{
System.out.println("name is "+name);
System.out.println("Balance is "+Balance1);
}
}
}
 
class AccountBalance{
public static void main(String args[])
{
Balance Current[]=new Balance[3];
Current[0]=new Balance("Abc",1500.0);
Current[1]=new Balance("Bc",1900.0);
Current[2]=new Balance("Cd",-2.0);
for(int i=0;i<3;i++)
{
Current[i].displayshow();
}
}
}



