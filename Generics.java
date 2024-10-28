class Gen<T>{
T ob;


Gen(T O)
{
ob=O;
}


T getob()
{
return ob;
}

void showtype()
{
 System.out.println("type of T is "+ob.getClass().getName());
}

}//Class gen closed

class GenTwo<T,V>
{
T ob1;
V ob2;

GenTwo(T O1 , V O2)
{
ob1= O1;
ob2=O2;
}


T getob()
{
return ob1;
}

void showtype()
{
 System.out.println("type of T is "+ob1.getClass().getName());
System.out.println("type of T is "+ob2.getClass().getName());
}
}


class GenDemo{
public static void main(String args[])
{

Gen<Integer> ob;
ob = new Gen<Integer>(88); //Autoboxing

ob.showtype();
int v=ob.getob(); //AutoUnboxing
System.out.println("Unboxed Object"+v);
System.out.println("-------------------------------------------");

System.out.println("For two parameters");


GenTwo<Integer,Double> TwoPar;
TwoPar= new GenTwo<Integer,Double>(74,3.147);
int i=TwoPar.getob();
double d=TwoPar.getob();
TwoPar.showtype();
System.out.println("Autounboxed values are : "+i+","+d);
}

}

