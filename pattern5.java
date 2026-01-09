import java.util.*;
class pattern5{
    static void printPattern(int N){
        for(int i=0;i<N;i++){
            for(int j=N;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int N=5;
        printPattern(N);
    }
}