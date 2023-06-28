package hashing;
import java.util.HashSet;
public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();// creation of the HasHSet
        set.add(1);
        set.add(2);
        set.add(3);
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

    }

}
