import java.util.*;
class ArrayMax{
    void MaxArray(){
        int [] arr = {2,4,8,3,9};
        int ans = 0 ;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        System.out.print("Maximum Value is : " + ans);
    }
}
public class MaxMain{
    public static void main(String[] args){
        ArrayMax obj = new ArrayMax();
        obj.MaxArray();
    }
}