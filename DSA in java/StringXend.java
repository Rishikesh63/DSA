// import javax.swing.text.StringContent;

public class StringXend {
    public static void Stringx(String str,int idx,String newStr,String strx){
    if(idx==str.length()) {
        newStr=newStr+strx;
        System.out.println(newStr);
        return;

    } char currChar= str.charAt(idx);
  
    if(currChar=='x'){
             strx=strx+'x';

    }
    else{
 newStr=newStr+currChar; 
    }
           Stringx(str, idx+1, newStr,strx);

    newStr=newStr+strx;
    }
    public static void main(String args[]){
      String str ="axbhdxxd";
   
      Stringx(str,0,"","");
    }
}



