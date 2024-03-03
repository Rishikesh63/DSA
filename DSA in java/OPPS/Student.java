package OPPS;

public class Student {
    String name;
    int age;
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
        System.out.println("constructor called");
    }
    Student(){
        
    }
    public void getinfo(){
     System.out.println("My name is:"+this.name);
     System.out.println("My age is:"+this.age);

    }
    public void displayinfo(String name){
  System.out.println(name);
    }
    public void displayinfo(int age){
  System.out.println(age);
    }
    public static void main(String args[]) {
     Student s1=new Student();
      s1.name="rishi";
      s1.age=20;
    Student s2 = new Student(s1);
    //    s2.name = "sarvesh";
    //    s2.age = 24;

       s2.getinfo();  
      s1.getinfo();
      s1.displayinfo(s1.name);
       s1.displayinfo(s1.age);



    }
    
}
