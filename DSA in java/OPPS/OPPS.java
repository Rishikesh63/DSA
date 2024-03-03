
 package OPPS;
class Shape{
    String color;
    public void area(){
        System.out.print("print area of called shape:");
    }
}
class Triangle extends Shape{
  public void printcolor(){
    System.out.println(this.color);
  }
  public void area(int l,int h){
    
   System.out.println(1/2*h*l);

  }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println("area of circle:"+(3.14)*r*r);
    }
}
 public class OPPS {

    public static void main(String args[]){
    Triangle t1 = new Triangle();
    Circle c1= new Circle();
    c1.area(4);
    t1.color="red";
    t1.area(3,4);
    // trianglearea(3, 4);
    t1.printcolor();
    }
    
}