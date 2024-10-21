abstract class Shape{
           abstract void PrintArea();
}
class Rectangle extends Shape{
           double length;
           double width;

           Rectangle(double length, double width)
           {
                  this.length=length;
                  this.width=width;
           }
           void PrintArea(){
                 double area=length*width;
                 System.out.println("The area of the rectangle is"+area);
           }
}
class Triangle extends Shape{
           double base;
           double height;
       
           Triangle(double base, double height)
           {
                  this.base=base;
                  this.height=height;
           }
           void PrintArea(){
                 double area=0.5*base*height;
                 System.out.println("The area of the triangle is"+area);
           }
}
class Circle extends Shape{
           double radius;
       
           Circle(double radius)
           {
                this.radius=radius;
           }
           void PrintArea(){
                   double area=3.14*radius*radius;
                   System.out.println("The area of the circle is"+area);
           }
}

public class Main{
           public static void main(String args[])
           {
                  Shape Rectangle = new Rectangle(20.0, 30.0);
                  Rectangle.PrintArea();
                  Shape Triangle = new Triangle(20.0, 30.0);
                  Triangle.PrintArea();
                  Shape Circle = new Circle(20.0);
                  Circle.PrintArea();
           }
}

