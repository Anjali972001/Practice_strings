package StringBuilders;
import java.util.*;
public class builder {
    public static void main(String[] args) {
StringBuilder str=new StringBuilder("Hello");
        System.out.println(str);
        // setCharAt()
        str.setCharAt(0,'M');
        System.out.println(str);
StringBuilder str1=new StringBuilder(100);
// append()
str.append(true);
        System.out.println(str);

  // insert(idx,ch)---> to insert the character at the particular index
  // delete(ch)---> To delete the character from the string.
  // reverse()---> reverse the entire string
  // delete(i,j)---> delete from i to j
    }
}
