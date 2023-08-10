//ITERATING
import java.util.*;
import java.io.*;
 public class basicfuntion{
    public static void main(String args[]){
        Collection<String>abc= new Collection<String>();

        abc.add("Shilpi ");
        abc.add("Sen ");
        abc.add("Is the student of ");
        abc.add("Asansol Engineering college.. dpt of ECE ");

        System.out.println("The list is : "+ abc);

        //create an iterator for the list
        //using "iterator()" method

        Iterator<String>iter=abc.iterator();

        System.out.println("The iterator values "+"of the list are ");
        while(iter.hasNext()){
            System.out.println(iter.next()+" ");
        }
    }
 }

 //Searching for elements
// The List interface provides several methods to search for elements, such as the indexOf(), lastIndexOf() methods.

import java.util.ArrayList;
import java.util.List;
 
public class ListExample {
    public static void main(String[] args) {
        // create a list of integers
        List<Integer> numbers = new ArrayList<>();
 
        // add some integers to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
     // use indexOf() to find the first occurrence of an element in the list
        int index = numbers.indexOf(2);
        System.out.println("The first occurance of 2 is at index " + index);

    // use lastIndexOf() to find the last occurance of an element in the list
        int index=numbers.lastIndexOf(2);
        System.out.println("The last occurance of 2 is at index "+lastIndex);
    }
}

//ACCESSING ELEMENT
//In order to access an element in the list, we can use the "get()" method, which returns the element at the specified index

import java.util.*;
 

class basicoperation {

public static void main(String args[])
{
    // Creating an object of List interface,
    // implemented by ArrayList class
    List<String> al = new ArrayList<>();
 
    // Adding elements to object of List interface
    al.add("Geeks");
    al.add("For");
    al.add("Geeks");

    //accessing the elements using "get()" method

    String first = al.get(0);
    String second = al.get(1);
    String third = al.get(2);

    System.out.println("First "+first);
    System.out.println("Second "+second);
    System.out.println("Third "+Third);
    System.out.println(al);
}
}

    //checking elements are present or not
    //In order to check if an element is present in the list, we can use the "contains()" method. This method returns true if the specified element is present in the list, otherwise it returns false.

    import java.util.*;
 

class basicoperation {

public static void main(String args[])
{
    // Creating an object of List interface,
    // implemented by ArrayList class
    List<String> al = new ArrayList<>();
 
    // Adding elements to object of List interface
    al.add("abc");
    al.add("Forever");
    al.add("Geeksers");
 
    // Checking if element is present using contains() method
    boolean isPresent = al.contains("forever");
    boolean isPresent = al.contains("abc");
 
    // Printing the result
    System.out.println("Is abc present in the list? " + isPresent);
}
}

                           List                        Set
          //  The List is an ordered sequence.	    The Set is an unordered sequence.
          //  List allows duplicate elements.	    Set doesn’t allow duplicate elements.
          //  Elements by their position can        Position access to elements is not allowed.
          //  be accessed.	                    
          //  Multiple null elements can be         The null element can store only once.
          //  stored.	
          //  List implementations are ArrayList,   Set implementations are HashSet, LinkedHashSet.
          //  LinkedList,Vector, Stack...  
        	