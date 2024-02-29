package Inheritance;

abstract class Aeroplane{

    abstract void takeoff();
    abstract void fly();
}

class Cargoplane extends Aeroplane{

    void fly(){
        System.out.println("cargoplane is ready to fly");
    }
   
void takeoff() {
    System.out.println("cargoplane is ready to takeoff");

    
}
}

class PassangerPlane extends Aeroplane{

    void fly(){
        System.out.println("PassangerPlane is ready to fly");
    }
    
   
    void takeoff() {
        System.out.println("PassangerPlane is ready to takeoff");

    }
}

public class Abstraction {
    public static void main(String[] args) {
       Aeroplane ref = new Cargoplane();
       ref.fly();
       ref.takeoff();

       Aeroplane ref1=new PassangerPlane();

    }
}
