package hashing;
import java.util.HashSet;
import java.util.Iterator;
public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();// creation of the HasHSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        // adding the element in the hashset

        // searching the element in the list.
        if(set.contains(1))
        {
            System.out.println("set contains 1");
        }
        if(!set.contains(6))
        {
            System.out.println("Does not contains 6");
        }
        // Delete
        set.remove(1);
        if(!set.contains(1))
        {
            System.out.println("Does not Contains 1");
        }
        //Duplicates are not allowed.


        // size  of the set is :
        System.out.println(set.size());

        // Print all the elements of the set
        System.out.println(set);

        // Iterator in the hashset:
        Iterator it =set.iterator();
        // it.next() will return the elements of the set.
        // This iterator has two important function-->hasNext,next
        // set is like the black box it can have the not arranged manner.
        // hasNext return true when it is pointed to either null or any element of the set
        // else it will return false Or it is pointing to the last element of the set
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
// There is guarantee that iterator will be in the order,it can be any order.
// hash set is unordered.



    }

}
