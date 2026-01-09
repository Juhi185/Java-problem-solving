import java.util.Scanner;
public class RecursionExamplerev{
    static void f(int i,int n){
        if(i<1){
            return ;
            System.out.print(i);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f(1,n);
    }
}