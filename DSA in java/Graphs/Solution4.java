package Graphs;
import java.util.*;
public class Solution4 {
    
    public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
   int n=sc.nextInt();
   int m = sc.nextInt();
   sc.nextLine();
   char[][] map = new char[n][m];
   for(int i=0;i<n;i++){
    String line = sc.nextLine();
    for(int j=0;j<m;j++){
        map[i][j] = line.charAt(j);
    }
    
}
System.out.println(map[0][0]);
    }
}
