package Graphs;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

import javax.xml.namespace.QName;
public class Solution1 {
    
    public static void main(String args[]){
        int v=5;
        int edges[][]={{0,1},{0,2},{1,3},{2,4}};
        int x =4;
        findlevel(edges, v, x);
    }

    public static void findlevel(int edges[][],int v,int x){

      ArrayList<Integer> adj[]= new ArrayList[v];
      for(int i=0;i<v;i++){
        adj[i]=new ArrayList<>();
      }
      for(int i=0;i<edges.length;i++){
        adj[edges[i][0]].add(edges[i][1]);
        adj[edges[i][1]].add(edges[i][0]);
      }
      boolean visited[]= new boolean[v];
      int level =0;
      LinkedList<Integer> q= new LinkedList<>();
      q.add(0);
      
      while(!q.isEmpty()){
        int qSz=q.size();
       while (qSz>0) {
        qSz--;
        int currNode = q.poll();
        if(currNode==x){
          System.out.println(level);
          return;
        }
        for(int i=0;i<adj[currNode].size();i++){
          if(!visited[adj[currNode].get(i)]){
            visited[adj[currNode].get(i)]=true;
            q.add(adj[currNode].get(i));
          }
        }
       }
       level++;
      }
      System.out.println(-1);
    }

}
