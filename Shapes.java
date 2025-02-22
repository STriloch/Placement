import java.util.*;
class Shape
{
  protected double area;
  public void calculate_area(){
      System.out.println("area of shapes");
  }
}
class Square extends Shape{
    private int a;
    public void calculate_area(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter value: ");
        a=in.nextInt();
        area=a*a;
        System.out.println(area+" is a area of Square");
    }
}
class Circle extends Shape{
    private double r;
    public void calculate_area(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter value: ");
        r=in.nextInt();
        area=3.14*r*r;
        System.out.println(area+" is a area of Circle");
    }
}
class Main{
    public static void main(String args[]){
        Shape s = new Shape();
        s.calculate_area();
        Shape a1 = new Circle();
        a1.calculate_area();
        Shape a2 = new Square();
        a2.calculate_area();
        
    }
}