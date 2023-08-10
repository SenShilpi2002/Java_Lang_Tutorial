abstract class Animal{
    abstract void walk();

    Animal(){
        System.out.println("you are creating a new animal");
    }
    public void eat(){
        System.out.println("animal can eat");
    }    
}
class Horse extends Animal{

    Horse(){
        System.out.println("created a Horse");//constructor chaining method
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Hen extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}


public class abstraction{
    public static void main(String args[]){
        Horse horse=new Horse();
        

}
}