//If class will final then inheritance can't place..
//If method will Final then method is inherit only.. 
//if varibale will final then it must bi fix all over the program..

package Inheritance;

class A{
    int b;
   final void sleep(){
        System.out.println("sleep");
    }
}
class B extends A{
    void take(){
        System.out.println("take sleep...");
    }
}
public class Final_keyword {
    public static void main(String[] args) {
        B obj=new B();
        obj.take();
    }
   
}
