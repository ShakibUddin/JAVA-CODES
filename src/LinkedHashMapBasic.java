import java.util.LinkedHashMap;

public class LinkedHashMapBasic {
    public static  void main(String[] args){
        //LinkedHashMap is just like HashMap with an additional feature of maintaining an order of elements inserted into it.
        //It prints elements the way it was inserted.
        //Hashmap sorts elements according to hashcode
        //Treemap sorts key in natural order
        //LinkedHashmap doesnt sort it prints the same way elements were inserted
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<Integer, String>();
        linkedHashMap.put(3,"Hey,");
        linkedHashMap.put(1,"What's Up?");
        linkedHashMap.put(2,"Friend!");
        System.out.println(linkedHashMap);
        //Other methods are same
    }
}
