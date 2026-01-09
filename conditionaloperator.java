import java.util.*;
public class conditionaloperator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int value = sc.nextInt();
        if(value%2==0 && value%3==0){

          System.out.print("This is the required number" + value)  ;
        }
        else
        System.out.print("This is not the required number ");
        



    }
}