class Distance{
      private int feet;
      private int inches;

      public Distance(int feet, int inches)
      {
           this.feet=feet;
           this.inches=inches;
           normalize();
      }
      private void normalize()
      {
           if(inches>=12)
           {
                feet=feet+(inches/12);
                inches=inches%12;
           }
      }
      public Distance add(Distance other)
      {
           int totalfeet=this.feet+ other.feet;
           int totalinches=this.inches+other.inches;
           return new Distance(totalfeet, totalinches);
      }

      public Distance compare(Distance other)
      {
           int thistotalinches=this.feet*12+this.inches;   
           int othertotalinches=other.feet*12+other.inches;
           return(thistotalinches>othertotalinches)?this:other;
      }
      public void display()
      {
           System.out.println(feet+"feet"+inches+"inches");
      }
}

public class Demo{
      public static void main(String args[])
      {
           Distance d1=new Distance(5, 8);
           Distance d2=new Distance(3, 10);

           Distance resultDistance=d1.add(d2);
           resultDistance.display();

           Distance greaterdistance=d1.compare(d2); 
           greaterdistance.display();
      }
}
