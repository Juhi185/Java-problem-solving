import java.util.*;
public class conditionaloperator1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int value = sc.nextInt();
        if(value%3==0 || value%5==0){
            System.out.print("Found Ans"  + value);

        }
        else
        System.out.print("Ans Not Found");
        
    }
}