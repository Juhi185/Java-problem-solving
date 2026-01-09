import java .util .Scanner;
public class recursionreverse{
    static void f(int i , int n){
        if(i<1){
            return ;
        }
        System.out.print(i+" ");
        f(i-1,n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Calling recursion...");5
        f(n,n);
    }
     
}