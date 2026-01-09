import java.util.*;
class ArrayEg{
    void demoArray(){
        int[][] TwodArray= new int[2][3];
        String[][] Name2d = {{"Riya","Sia"},{"Mira","Hira"},{"Sona","Mona"}};
        TwodArray[1][2] = 24;
        
        System.out.println(TwodArray[1][2]);
        System.out.println(Name2d[0][1]);
    }
}
public class ArrayExample{
    public static void main(String[] args){
        ArrayEg obj = new ArrayEg();
        obj.demoArray();

    }
}
