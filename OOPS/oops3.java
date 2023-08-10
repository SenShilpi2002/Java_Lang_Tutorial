import java.util.*;//build in package

class Shape{
    String color;
    public void area(){
        Sustem.out.println("display area");
    }

}
class Triangle extends Shape{     //single level inheritance
    public void area(int l,int h){
        System.out.println(1/2*i*h);
    }
}
class Equilateraltraingle extends Triangle{        //multilevel inheritance
    public void rea(int l,int h){
       System.out.println(1/2*i*h);
    }
}

class Circle extends Shape{         //hirerchical inheritance
    public void area(int r){
         System.out.println((3.14)*r*r);
    }
}

public class oops3{
    public static void main(String arg[]){
        triangle t1=new Triangle();
        t1.color="orange";
    }
}


//packages
//build in packages and user defined packages




















