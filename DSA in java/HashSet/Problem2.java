package HashSet;
import java.util.HashSet;

public class Problem2 {
    public static int intersectionArray(int arr1[],int arr2[],int count){
     HashSet<Integer> set = new HashSet<>();
     for(int i=0;i<arr1.length;i++){
    if(!set.contains(arr1[i])){
        set.add(arr1[i]);
    }

     }
     for(int j=0;j<arr2.length;j++){
    if(set.contains(arr2[j])){
        count++;
        set.remove(arr2[j]);
    }
     }
     return count;
    }
    public static void main(String args[]){
        HashSet<Integer> map= new HashSet<>();
        int arr1[]={1,2,3,4,5,2};
        int arr2[]={3,2,4,6};
        for(int i=0;i<arr1.length;i++){
            if(!map.contains(arr1[i])){
              map.add(arr1[i]);
            }
        }
        for(int j=0;j<arr2.length;j++){
            if(!map.contains(arr2[j])){
                map.add(arr2[j]);
            }
        }
    System.out.println(map);
    System.out.println(intersectionArray(arr1, arr2, 0));
    }

}
