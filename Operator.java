import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println("a"+2);
       // System.out.println(new Integer(65)+new ArrayList<>());
        //the above line show error bcz we are tryint to perform addition on two objects
        String result=56+""+new ArrayList<>();
        System.out.println(result);
    }
}
