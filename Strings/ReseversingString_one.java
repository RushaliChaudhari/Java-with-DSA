/*Before Reversing pwjava
After Reversing avajw*/

package String;

 class ReseversingString_one {
   public static void main(String[] args) {
    String str= "pwjava";
    String str2="";
    System.out.println("Before Reversing "+str);

    for(int i=str.length()-1;i>=0;i--){
        str2=str2+str.charAt(i);
    }
    System.out.println("After Reversing " + str2);
}
}
