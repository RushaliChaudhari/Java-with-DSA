/*Before Reversing the String:Pw Java
After Reversing the String:avaJ wP*/ 

package String;
public class ReseversingString_two {
    public static void main(String[] args) {
        String str1="Pw Java";
     String str2="";
     String arr[]=str1.split("");
     for(int i=str1.length()-1;i>=0;i--){
       str2=str2+arr[i];
   }
   System.out.println("Before Reversing the String:"+str1);

   System.out.println("After Reversing the String:"+str2);
    }
   
}
