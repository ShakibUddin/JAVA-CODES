import java.util.*;

public class TreeSetBasic {
    //TreeSet is one of the most important implementations of the SortedSet interface in Java that uses a Tree for storage
    //TreeSet implements the SortedSet interface so duplicate values are not allowed.

    public static void main(String[] args){
        int index=0;
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(4);
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(1);
        Iterator it = treeSet.iterator();
        //getting index treeset.headset(element).size()
        //it actually sets limit till the element and prints the size of the subTreeSet excluding the element
        //So when 4 is passed as element a subTreeSet is created consisting 1,2,3 excluding 4 which is the element
        //and prints size which is 3 (1,2,3)
        //code of headset is explained below
        System.out.println("Element at "+treeSet.headSet(1).size()+" is "+1);
        System.out.println("Element at "+treeSet.headSet(2).size()+" is "+2);
        System.out.println("Element at "+treeSet.headSet(3).size()+" is "+3);
        System.out.println("Element at "+treeSet.headSet(4).size()+" is "+4);
        System.out.println("Element at "+treeSet.headSet(5).size()+" is "+5);
        System.out.println("Element at "+treeSet.headSet(6).size()+" is "+6);
        System.out.println("Element at "+treeSet.headSet(10).size()+" is "+10);
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //Reverseing a treeset
        NavigableSet<Integer> reverseTreeSet = treeSet.descendingSet();
        it = reverseTreeSet.iterator();
        System.out.println("Reversed TreeSet");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Element at "+reverseTreeSet.headSet(10).size()+" is "+10);
        System.out.println("Element at "+reverseTreeSet.headSet(6).size()+" is "+6);
        System.out.println("Element at "+reverseTreeSet.headSet(5).size()+" is "+5);
        System.out.println("Element at "+reverseTreeSet.headSet(4).size()+" is "+4);
        System.out.println("Element at "+reverseTreeSet.headSet(3).size()+" is "+3);
        System.out.println("Element at "+reverseTreeSet.headSet(2).size()+" is "+2);
        System.out.println("Element at "+reverseTreeSet.headSet(1).size()+" is "+1);
        if(treeSet.contains(6)){
            System.out.println("Treeset contains 6,removng it now");
            treeSet.remove(6);
        }
        System.out.println("First Element of treeset is "+ treeSet.first());
        System.out.println("Last Element of treeset is "+ treeSet.last());

        //The java.util.TreeSet.headSet() method is used as a limit setter for a tree set,
        //to return the elements up to a limit defined in the parameter of the method in a sorted manner excluding the element.
        TreeSet<Integer> head_set = new TreeSet<Integer>();
        head_set = (TreeSet<Integer>)treeSet.headSet(4);//setting limit up untill 4...so 1,2,3 will be printed
        it = head_set.iterator();
        System.out.println("Printing subTreeSet till 4");
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //higher​(E e): This method returns the least element in this set strictly greater than the given element, or null if there is no such element.
        //lower​(E e): This method returns the greatest element in this set strictly less than the given element, or null if there is no such element.
        System.out.println("Enter a number to check if something is higher than that in the TreeSet");
        Integer x = sc.nextInt();
        if(treeSet.higher(x)==null){
            //What is higher than x in this TreeSet
            System.out.println("There is nothing higher than "+x+" here");//treeSet.higher(x) Outputs null
            System.out.println(treeSet.lower(x)+" is lower than "+x+" in this treeSet");
        }
        else{
            System.out.println(treeSet.higher(x)+" is higher than "+x+" in this treeSet");
        }
        //pollFirst​(): This method retrieves and removes the first (lowest) element, or returns null if this set is empty.
        //pollLast​(): This method retrieves and removes the last (highest) element, or returns null if this set is empty.
        System.out.println("Printing from High to Low");
        while(!treeSet.isEmpty()){
            System.out.println(treeSet.pollLast());//removing highest element from treeset and printing it
            //OUTPUT : 5,4,3,2,1
            //if pollfirst was used OUTPUT will be 1,2,3,4,5(it's also another way of reverse printing TreeSet but not reversing physically)
        }
        //TreeSet.ceiling()
        //This method returns the least element greater than or equal to e, or null if there is no such element.
        //TreeSet.floor()
        //This method returns the least element smaller than or equal to e, or null if there is no such element.
        TreeSet<Integer> newtreeSet = new TreeSet<Integer>();//creted new TreeSet because treeSet is cleared in above pollLast() method
        newtreeSet.add(1);
        newtreeSet.add(2);
        newtreeSet.add(3);
        newtreeSet.add(4);
        newtreeSet.add(5);
        System.out.println("Enter an element to check ceiling and floor");
        Integer check = sc.nextInt();
        if(newtreeSet.floor(check)==null){
            System.out.println("There is nothing Smaller/Equal than "+check+" in newtreeSet");
        }
        else{
            System.out.println(newtreeSet.floor(check)+" is Smaller/Equal than "+check+" in newtreeSet");
        }
        TreeSet<Integer> setToRemove = new TreeSet<Integer>();
        setToRemove.add(3);
        setToRemove.add(4);
        System.out.println("new treeSet is "+newtreeSet);
        newtreeSet.removeAll(setToRemove);//Using removeAll to remove range of elements from TreeSet..
        System.out.println("After removing setToRemove TreeSet "+setToRemove+" from newtreeSet we get "+newtreeSet);

    }
}
