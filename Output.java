import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(59);//internally this integer converted into toString
        System.out.println("pd");
        System.out.println(new int[]{1,2,3});//this array object also first converted into to string
        //we can override the toString() method for pretty printing
        System.out.println(Arrays.toString(new int[]{2,4,5}));
    }
}
