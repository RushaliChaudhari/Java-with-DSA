/*A string is a pangram string if it contains all the character of
 the alphabets ignoring the case of the alphabets*/

package String;

public class Panagram 
{
    public static void main(String[] args) 
    {
       boolean flag=false;
        String str="THE QUICK ROWN FOX JUMPS OVER LAZY DOG";
        str=str.replace(" ", "");
        char []ch=str.toCharArray();

        int ar[]=new int[26];

        for(int i=0;i<ch.length;i++)
        {
            ar[ch[i]-65]++;
        }
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==0)
            {
                System.out.println("Its not pangram");
                flag=true;
            }
        }
        
        if(flag==false)
        {
            System.out.println("Its pangram");
        }
        
   }
    
}






// public class Panagram {
//     public static void main(String[] args) {
//         boolean flag=false;
//         String str="is i am lazy";
//         str=str.replace(" ","");

        
//         char ch[]=str.toCharArray();

//         int[] arr=new int[26];

//         for(int i=0;i<ch.length;i++){
//             arr[ch[i]-97]++;
//         }

//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==0){
//                 System.out.println("Not panagram");
//                 flag=true;
//             }
//         }
        
//             if(flag==false){
//                 System.out.println("it is panagram");
//             }
       
       
//     }
   

// }


