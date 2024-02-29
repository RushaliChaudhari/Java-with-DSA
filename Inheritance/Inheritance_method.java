/*methods of inheritance 
1. Inherited method
2.Overriden Method
3.speciaalize method*/

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

public class Inheritance_method {
    public static void main(String[] args) {
        Cargoplane c= new Cargoplane();
        c.fly();
        c.carryGoods();

        PassangerPlane p=new PassangerPlane();
        p.takeoff();

    }
}
