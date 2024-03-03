package HashSet;
import java.util.*;
public class Hashmap {
    
    public static void main(String[] args) {
        
        HashMap<String, Integer>mymap= new HashMap<>();
        //Insetion-Hashmap are unoder
        
        mymap.put("India",135);
        mymap.put("china",155);
        mymap.put("US",100);
        mymap.put("US",50);

    System.out.println(mymap);
    //search
    if(mymap.containsKey("china")){
     System.out.println("key is present");
    } else{
        System.out.println("key is not present");
    }
    System.out.println(mymap.get("china"));
    System.out.println(mymap.get("America"));
    int arr[]={12,13,14};
    //Map.Entry<Integer,Integer>e:Map.entrySet
   for( int s:arr){
System.out.println(s);
   }
   for(Map.Entry<String,Integer>e:mymap.entrySet()){
System.out.println(e.getKey());
System.out.println(e.getValue());
   }
   mymap.remove("china");
   System.out.println(mymap);
   Set<String>keys=mymap.keySet();
   for(String key:keys){
    System.out.println(key +" "+mymap.get(key));
   }
    }
}


