import java.util.Scanner;

abstract class Shape1 {
    int b, h;

    abstract public void PrintArea();
}
class Triangle extends Shape1{
    public int AreaOfTriangle;
    public void PrintArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base of the Triangle:");
        b= sc.nextInt();
        System.out.println("Enter the Height of Triangle:");
        h=sc.nextInt();
        AreaOfTriangle= (int) (0.5*b*h);
        System.out.println("Area of Triangle is "+ AreaOfTriangle);
    }
}
public class ShapeClass1 {
public static void main(String[] args){
    Triangle t =new Triangle();
    t.PrintArea();
  }
}
