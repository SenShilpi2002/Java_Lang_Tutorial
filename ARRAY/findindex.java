import java.util.*;

public class findindex{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size=sc.nextInt();

        int arr[]=new int [size];

        System.out.println("Enter array elements");
        for(int i=0 ;i<size; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the number which have to search");
        int x=sc.nextInt();


        for(int i=0;i<size;i++){
            if(arr[i]==x){
                System.out.println("x is found at index : "+i);
            }
        }
    }
}