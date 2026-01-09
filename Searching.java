import java.util.*;
class SearchArray{
    void ArraySearch(){
        int [] arr = {1,4,3,9,2};
        int x = 9 ;
        int ans = -1;
        for(int i = 0; i < arr.length;i++){
            if(arr[i]==x){
                ans = i ; 

            }

        }
         System.out.print("Found " +  x  +  " at index " + ans);
    
    }
   
}
public class Searching{
    public static void main(String[] args){
        SearchArray obj = new SearchArray();
        obj.ArraySearch();
    }
}