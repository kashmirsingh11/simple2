import java.util.ArrayList;

public class mydemo {
    public static void main(String[] args) {
        System.out.println("new statement!");
        System.out.println("hello");
        ArrayList<Integer> list  =new ArrayList<>();

        for(int var:list){
            if(var==6)
            System.out.println(var);
        }

        System.out.println("end!");
        System.out.println("this is not end yet!");
     }
}
