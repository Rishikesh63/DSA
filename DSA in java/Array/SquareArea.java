package Array;
import java.util.Scanner;
public class SquareArea {
    
public static void printArea(int x1,int x2){
    int area = ((x1)-(x2))*((x1)-(x2));
    System.out.println(area);
}
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int x1= sc.nextInt();
        int y1 = sc.nextInt();
        int x2= sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        printArea(x1, x2);

    }
}
