import java.util.*;
public class productfunction{
    public static int calculateproduct(int a,int b){
        int product= a*b;
        return a*b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int product= calculateproduct(a,b);
        System.out.print("Product: " + calculateproduct(a,b));
        
    }
}
