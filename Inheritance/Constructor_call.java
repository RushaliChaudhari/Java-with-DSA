package Inheritance;
class Demo{
    int n,m;
    public Demo(){
        System.out.println("Default Constructor in demo calss");
    }
    public Demo(int x,int y){
        this();
        x=n;
        y=m;
        System.out.println("Parametrized Constructor "+x+y);
    }
}
class Demo2 extends Demo{
    public Demo2(){
        this(10,20);
        System.out.println("Default constricor in Demo2 class");
    }
    public Demo2(int x,int y){
        super(10,20);
        System.out.println("paramaetrized constructor in demo2");
    }
}


class Constructor_call{
public static void main(String[] args) {
    Demo2 d=new Demo2();
    
}
}