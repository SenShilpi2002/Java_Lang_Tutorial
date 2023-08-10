import java.util.*;
public class lcmof2no{
    public static void main(String srgs[]){
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        int i=1;
        int gcd=1;
        System.out.println("Enter the 2 numbers ");
        num1=sc.nextInt();
        num2=sc.nextInt();

        for(i=1;i<=num1 && i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
        }
        int lcm=(num1*num2)/gcd;
        System.out.println("The lcm of 2 number is : " +lcm );

    }

}