class Student{
    public int roll_no;
    public String name;

     Student(int roll_no , String name){
        this.roll_no = roll_no;
        this.name = name;
     }
     
}
public class Arrayclass{
    public static void main(){
        Student[] arr = new Student[4];

        arr[0] = new Student( 1,"Alice");
        arr[1] = new Student(2,"Bella");
        arr[2] = new Student(3,"Diva");
        arr[4] = new Student(4,"Celina");
        for(int i=0;i<arr.length;i++){
            System.out.println("Element at"+ i+":{"+ arr[i].roll_no + " "+ arr[i].name + "}")
        }
    }
}
