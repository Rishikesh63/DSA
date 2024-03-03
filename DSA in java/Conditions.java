// import java.io.*;
import java.util.*;

public class Conditions {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int age = scanner.nextInt();
    scanner.close();
    int x=10;
    System.out.println("x=" + x);
    if(age>18){
        System.out.println("adult");
    }
    else{
        System.out.println("not Adult ");
    }
}   
}