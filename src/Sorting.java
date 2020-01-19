import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args){
        int[] arr = {2,5,7,1,0,1,4};
        Arrays.sort(arr);
        System.out.println("Ascending Sorted array is "+ Arrays.toString(arr));
        Integer[] arrobj = {2,5,7,1,0,1,4};
        Arrays.sort(arrobj,Collections.reverseOrder());
        System.out.println("Descending Sorted array is "+ Arrays.toString(arrobj));
        ArrayList<String> words = new ArrayList<String>();
        words.add("to");
        words.add("Aron");
        words.add("goes");
        words.add("university");
        Collections.sort(words);//because ArrayList is from Collection framework
        System.out.println("Sorted words are "+words.toString());
    }
}
