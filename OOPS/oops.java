class pen{
    String color;
    String type; //ballpoint pen; gel

    public void write(){
        System.out.println("Writing somthing");
}
    public void printcolor(){
        System.out.println(this.color);
    }

}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class oops{
    public static void main(String arg[]){
       /* pen pen1 =new pen();
        pen1.color="blue";
        pen1.type="gel";

        pen pen2=new pen();
        pen2.color="red";
        pen2.type="ballpoint";

        pen1.printcolor();
        pen2.printcolor();*/

        Student s1=new Student();
        s1.name="Agnisis";
        s1.age=20;

        Student s2=new Student();
        s2.name="shilpi";
        s2.age=21;


        s1.printInfo();
        s2.printInfo();






    }
}