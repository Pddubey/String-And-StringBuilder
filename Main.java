public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*String objects lives in String pool
        String pool is basically a seperate memory area inside the heap
         */
        String a="pd";
        String b="pd";
        /*both a and b reference variables pointing to the same object
        created on the string pool
         */
        //Note:- String are immutabels we can not change their value
        a="priyanshu";//but here we are changing the value , kyu bhaishaab?
    }
}