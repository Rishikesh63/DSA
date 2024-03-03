package HashSet;
import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int nums[] = {1, 2, 3, 1, 5, 1, 5, 5};

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];

            if (map.containsKey(currentNumber)) {
                int frequency = map.get(currentNumber);
                map.put(currentNumber, frequency + 1);
            } else {
                map.put(currentNumber, 1);
            }
        }
       for(Map.Entry<Integer,Integer> e:map.entrySet()){
        if(nums.length/3<e.getValue()){
   System.out.println(e.getKey());
        }
       }
    }
}
