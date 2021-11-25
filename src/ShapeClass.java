import java.util.Scanner;

abstract class shape
{
    int a,b;
    abstract public void PrintArea();
}
class rectangle extends shape {
    public int AreaRectangle;
    public void PrintArea() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Length  of Rectangle");
        a=s.nextInt();
        System.out.println("Enter the  Breadth of Rectangle");
        b=s.nextInt();
        AreaRectangle=a*b;
        System.out.println("The area of rectangle is:" + AreaRectangle);
    }
}

 public class ShapeClass {
  public static void main(String[] args) {
        rectangle r=new rectangle();
        r.PrintArea();
    }
}