//constructor in java

/*class Student{
    //nonparametarised constructor
    Student(){
        System.out.println("constructor called");
    }
}
public class oops1{
    public static void main(String arg[]){
        Student s1=new Student();
        
    }

}*/

//parameterised constructor

/*class Student{
    String name;
    int age;
    public void printId(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}

public class oops1{
    public static void main(String arg[]){
        Student s1= new Student("shilpi",20);
        s1.printId();
    }
}*/

//copy constructor

class Fruit{
    String name;
    String type;

    public void printQuality(){
        System.out.println(this.name);
        System.out.println(this.type);
    }


    Fruit(Fruit f2 ){
        this.name=f2.name;
        this.type=f2.type;
    }
    Fruit(){

    }

    
}
public class oops1{
    public static void main(String arg[]){
        Fruit f1=new Fruit();
        f1.name="Mango";
        f1.type="juisy";

        Fruit f2=new Fruit(f1);

       f1.printQuality();
       f2.printQuality();

    }
}

























