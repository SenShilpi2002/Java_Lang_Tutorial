 //polymorphism
 //poly=many;morphism=forms;

 //function overloading(compiletime);
 //funtion overriding(runtime);
class Student{
    String name;
    float  id;
    int age;

    public void printInfo(String name){
        System.out.println("name "+ name + " ");
    }
    public void printInfo(float id){
        System.out.println("id " + id + " ");
    }
    public void printInfo(int age){
        System.out.println("age " + age + " ");
    }
    public void printInfo(String name,float id,int age){
        System.out.println("name " + name + " " + "id " + id + " " + "age " + age + " ");
    }

}
public class oops2{
    public static void main(String arg[]){
        Student s1=new Student();
        s1.name="shilpi";
        s1.age=20;
        s1.id=070;

        s1.printInfo(s1.name,s1.id,s1.age);
    }
}









