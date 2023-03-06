import java.util.*;

public class example1{
      
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int numbers[]=new int[size];

        System.out.println("The array elements are ");
        for(int i=0; i<size ;i++){
            numbers[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
      }
}