import java.util.*;
class ArraySum{
    void SumofArray(){
        int[] arr = {1,5,3};
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
public class Mainsum{
    public static void main(String[] args){
        ArraySum obj = new ArraySum();
        obj.SumofArray();
    
    }
}