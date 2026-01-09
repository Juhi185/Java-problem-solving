import java.util.*;
class Maximumvalue{
    void MaxArray(){
        int [] arr = {7,9,45,27,89,90};
        ans = 0;
        for(int i=0;i>arr.length;i++){
            if(arr[i]>ans){
                ans= arr[i];
            }
        }
        System.out.println("Max" + Max);

    }
            

}
public class Maximumvalue{
    public static void main(String [] args){
        Maximumvalue obj = new Maximumvalue();
        obj.MaxArray();
    }
}