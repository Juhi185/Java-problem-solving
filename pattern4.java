import java.util.*;
class pattern4{
    static void pattern4(int N){
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int N=4;
        pattern4(N);
    }
}