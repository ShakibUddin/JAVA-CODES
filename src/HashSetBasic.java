import java.util.HashSet;
import java.util.Iterator;

public class HashSetBasic {
    public static void main(String[] args){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(12);
        hashSet.add(21);
        hashSet.add(34);
        hashSet.add(34);
        hashSet.add(null);
        hashSet.add(81);
        hashSet.add(46);
        System.out.println("Element entering order is 12,21,34,34,null,81,46");
        System.out.println("Elemnt in hashset ");
        System.out.println(hashSet);//OUTPUT : [81, 3, 21, 12, 46]..Sorts according to hashcode
        //Doesnt allow duplicate value
        //NULL elements are allowed in HashSet.
        if(hashSet.contains(null)){
            hashSet.remove(null);
        }
        System.out.println("Size of hashSet is "+hashSet.size());
        Iterator it = hashSet.iterator();
        while(it.hasNext()){
            System.out.println("hashSet includes "+it.next());
        }
        System.out.println("Clearing hashset");
        hashSet.clear();
        if(hashSet.isEmpty()){
            System.out.println("hashSet is empty");
        }
    }
}
