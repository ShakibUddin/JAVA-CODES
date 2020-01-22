import org.w3c.dom.html.HTMLTableColElement;

import javax.jnlp.IntegrationService;
import java.util.Collections;
import java.util.TreeMap;

//For operations like add, remove, containsKey, time complexity is O(log n where n is number of elements present in TreeMap.
//TreeMap always keeps the elements in a sorted(increasing) order, while the elements in a HashMap have no order.
// TreeMap also provides some cool methods for first, last, floor and ceiling of keys.
//HashMap implements Map interface while TreeMap implements SortedMap interface.
// A Sorted Map interface is a child of Map.
//TreeMap can be a bit handy when we only need to store unique elements in a sorted order.
public class TreeMapBasic {
    public static void main(String[] args){
        TreeMap<Integer,String> tmap = new TreeMap<Integer, String>();
        tmap.put(3,"C");
        tmap.put(1,"A");
        tmap.put(2,"B");
        //added elements without ordering
        System.out.println(tmap);
        //OUTPUT:
        //{1=A, 2=B, 3=C}
        //TreeMap sorted keys in natural order
        if(tmap.containsKey(1)){
            System.out.print("Treemap contains 1");
            //Other methods are like HashMap
            //TreeMap also provides some cool methods for first, last, floor and ceiling of keys.
        }

    }

}
