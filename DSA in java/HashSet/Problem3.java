package HashSet;
import java.util.HashSet;
public class Problem3 {
    
    public static void main(String[] args) {
        HashSet<Integer> map =new HashSet<>();
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,3,4,5};
        int count=0;
        for(int i=0;i<arr1.length;i++){
            map.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            if(map.contains(arr2[j])){
                map.remove(arr2[j]);
                count++;
            }
        }
        System.out.println(count);
        
    }
}
