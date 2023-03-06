import java.util.*;
public class twodarray1{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row size");
         int rows=sc.nextInt();
         System.out.println("Enter the columns size");
         int columns=sc.nextInt();

         //2d array declaration

         int[][] arr = new int[rows][columns];

         System.out.println("Enter the elements of 2d array");

         for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
            }
         }


         for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
         }    
    }
}