public class Generics {
    //Benefits of generic functions in java
    //Code Reuse: We can write a method/class/interface once and use for any type we want.
    private static <T> void add(T element1,T element2){
        System.out.println("When we add '"+element1+"' and '"+element2+"' we get "+element1+element2);
    }
    public static void main(String[] args){
        //In Parameter type we can not use primitives like
        //      'int','char' or 'double'.
        add(3,4);
        add("That's a ","nice concept");
        add("My age is ",23);
    }
}
