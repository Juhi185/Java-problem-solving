import java .util.Scanner;
public class Recursion{
    static void f(int i,int n){
        if(i>4){
            return ;
        }
        System.out.print(i);
        f(i+1,n);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        f(1,n);
    }
}
