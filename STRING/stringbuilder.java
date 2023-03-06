import java.util.*;
public class stringbuilder{
    public static void main(String arg[]){
       StringBuilder sb=new StringBuilder("shilpi");

        //.CharAt() index 0
        System.out.println(sb.charAt(0));

        //.setCharAt()
        sb.setCharAt(0,'p');
        System.out.println(sb);


        //.insert()
        sb.insert(2,'h');
        sb.insert(3,'i');
        System.out.println(sb);

        //.delete()
        sb.delete(2,4);
        System.out.println(sb);


        //append()
        String space;
        int a=90;
        StringBuilder sb=new StringBuilder(100);
        space=sb.append("The alphabet a is : ").append(a).append(" amt").toString();
        System.out.println(space);
    }
}