import java.util.*;
public class function{
public static void PrintMyName(String name){
    System.out.print(name);
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name= sc.next();

        PrintMyName(name);
        

    }
}