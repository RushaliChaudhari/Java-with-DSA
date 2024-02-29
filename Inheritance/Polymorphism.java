package Inheritance;

class Aeroplane{
    void takeoff(){
        System.out.println("Aeroplane is ready to takeoff");
    }

    void fly(){
        System.out.println("Aeroplane is ready to fly");
    }
}

class Cargoplane extends Aeroplane{

    void fly(){
        System.out.println("cargoplane is ready to fly");
    }
   void carryGoods(){
       System.out.println("cargoplane good");//specialized method
   }
}

class PassangerPlane extends Aeroplane{

    void fly(){
        System.out.println("PassangerPlane is ready to fly");
    }
    void carryPassenger(){
        System.out.println("PassangerPlane goods");//specialized method
    }
}
class Airport{
       void  GetPlane(Aeroplane ref){
        ref.fly();
        ref.takeoff();

        System.out.println("--------------------------------------");
}
}

public class Polymorphism{
    public static void main(String[] args) {
        Cargoplane cp= new Cargoplane();
        PassangerPlane pp=new PassangerPlane();
      
        Airport air=new Airport();
        air.GetPlane(cp);
        air.GetPlane(pp);




    }
}
 
