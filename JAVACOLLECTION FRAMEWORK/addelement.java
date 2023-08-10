import java.util.*;
import java.io.*;
public class addelement{
    public static void main(String args[]){
        //creating instances of the array
        //vector,hastable
        int arr[]=new int[]{1,3,4,5,6};
        Vector<Integer>v=new Vector();
        Hashtable<Integer,String>h=new Hashtable();
        
        //adding element into the vector
        v.addElement(1);
        v.addElement(6);

        //Adding element into the Hashtable

        h.put(1,"B777");
        h.put(2,"A320 aribus");
         // Vector element insertion requires addElement(),
        // but hashtable element insertion requires put()

        System.out.println(arr[3]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));
        // Array elements are accessed using [],
        // vector elements using elementAt()
        // and hashtable elements using get()
         }
        }

         //ARRAYLIST
        import java.util.*;
        import java.io.*;

        class arraylist{

            public static void main(String arg[]){
                //declaring arraylist
                ArrayList<Integer> al=new ArrayList<Integer>();

                //appending new elements at the the end of the list
                for(int i=0;i<=5;i++){
                    al.add(i);

                    System.out.println(al);
                }
                al.remove(3);
                    System.out.println(al);

                    for(int i=0;i<al.size();i++){
                        System.out.println(al.get(i)+" ");
                    }





            }
        }



        //LINKEDLIST
        import java.util.*;
        import java.io.*;

        public class linkedlist{
            public ststic void main(String args[]){

                //declaring the linkedlist
                LinkedList<Integer>ll=new LinkedList<Integer>();

                //appending data
                for(int i=0;i<=ll.size();i++){
                    ll.add(i);

                }
                System.out.println(ll);

                ll.remove(4);

                System.out.println(ll);


                for(i=0;i<ll.size();i++){
                    System.out.println(ll.get(i)+" ");
                }


            }
        }


//VECTOR
import java.io.*;
import java.util.*;
  
class GFG {
    
      // Main Method
    public static void main(String[] args)
    {
  
        // Declaring the Vector
        Vector<Integer> v = new Vector<Integer>();
  
        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            v.add(i);
  
        // Printing elements
        System.out.println(v);
  
        // Remove element at index 3
        v.remove(3);
  
        // Displaying the Vector
        // after deletion
        System.out.println(v);
  
        // Printing elements one by one
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
    }
} 

//STACK
//Stack is a subclass of Vector and a legacy class. It is thread-safe which might be overhead in an environment where thread safety is not needed. An alternate to Stack is to use ArrayDequeue which is not thread-safe and has faster array implementation.
import java.util.*;
import java.io.*;

public class stack{
    public static void main(String arg[]){

        Stack<String> stack=new Stack<String>();
        stack.push("biographical");
        stack.push("nature is the proccess");
        stack.push("between human and nature ");

        //Iterator for the stack
        Iterator<String>itr=stack.iterator();

        //printing the stack

        while(itr.hasNext()){
            System.out.println(itr.next()+" ");
        }

        System.out.println();

        stck.pop();

         // Iterator for the stack
        itr = stack.iterator();
    }
}