public class Comaparison {
    public static void main(String[] args) {
        //Creating string object in to string pool
        String a = "Priyanshu";
        String b = "Priyanshu";
    /*basically there is one string object, a and b reference variables
    pointing to for validation of this we use == operator
     */
        System.out.println(a==b);
    //creating string object into heap instead of pool
        String c=new String("Dubey");
        String d=new String("Dubey");
        /*
        Here in this case there is two different string objects
        created into heap whose values are same but objects not
         */
        System.out.println(c==d);//it will show false

        /*
        For checking value of the string object is same or not
        we use .equals() method on string object
         */
        System.out.println(a.equals(b));//That's true
        System.out.println(c.equals(d));//that's also true
        System.out.println(a.equals(c));//that;s not true
        System.out.println(b.equals(d));//that's also not true
    }
}
