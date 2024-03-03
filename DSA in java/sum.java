public class sum {
    static void mysum(int[] array,int target){
        if(array.length==0){
            System.out.println("empty array");
        }
        else{
           for(int i=0;i<array.length;i++){
              for(int j=i+1;j<array.length;j++){
                if(target==array[i]+array[j]){
                    System.out.println("["+i+"," +j+"]");
                }
              }
      }
             
    } 
        }
       
    public static void main(String[] args){
       int[] array={2,4,5};
       int target =5;
       mysum(array, target); 

      }
}