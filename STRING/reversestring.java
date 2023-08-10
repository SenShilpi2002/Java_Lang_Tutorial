import java.util.*;
public class reversestring{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Ocean view");


        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;    //1.> 5-1-0=4, 2.> 5-1-1=3, 3.> 5-1-2=2 
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back); 

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);

        }
        System.out.println(sb);
    }
}