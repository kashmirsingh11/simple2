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

        for(int i=0;i<10;i++){
            System.out.println(i);
        }

        System.out.println("finish!");
     }
}
