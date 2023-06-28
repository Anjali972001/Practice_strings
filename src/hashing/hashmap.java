package hashing;
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        // we will use hashMap where we want to store the pair of Key and values
       // suppose we want to store the roll no and name in the table the roll number will act as the key as it is
        // unique in the nature.
        HashMap<String,Integer> map=new HashMap<>();
        // Insertion operation.
        map.put("India",120);
        map.put("Usa",30);
        map.put("china",150);

        // to print the map
        System.out.println(map);
        // HashMaps are unordered in nature.

        // If we want to update the value then we will do
        map.put("china",110);
        System.out.println(map);

        // search / lookup operation:
        if(map.containsKey("Russia"))
        {
            System.out.println("no");
        }
        else {
            System.out.println("Yes");
        }

        // get()
        System.out.println(map.get("china"));
        System.out.println(map.get("Russia"));
    }
}
