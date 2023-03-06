/*import java.util.*;
public class declaration{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Your name is "+name);
    }
}*/

//CONCATINATION FUNCTION
//string length
/*import java.util.*;
public class declaration{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Your name is "+name);
        System.out.println(name.length());
    }
}*/


import java.util.*;
public class declaration{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Your name is "+name);


        //charAt
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
}



/*import java.util.*;
public class declaration{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //COMPARE
        String sc1="panna";
        String sc2="shilpi";
        /*below three condition should check in compareTo()funtion*/
        //1.  s1>s2 :positive value
        //2.  s1==s2 :0
        //3.  s1<s2 :negative value

        //horse owl (compare the first alphabet of these two word and which one get first,then we can assume that is lower string than the next one ;in this exp hourse is least string and owl is higher string)

       /* if(sc1.compareTo(sc2)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}*/


/*import java.util.*;
public class declaration{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String sentance="java is object oriented programming language";
        //substring(beg index,end index)
        String name=sentance.substring(15,sentance.length());
        System.out.println(name);


    }
}*/













