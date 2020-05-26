import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    @Test
    public void testHelloWrold() {
        List list =new ArrayList ();
        int[]arr={1,2,3,3,1,2,};
        Set set =new HashSet ();
        Arrays.sort (arr);
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains (arr)) {
                list.add (arr[i]);
            }
            set.add (arr[i]);
        }
        System.out.println (list);
        System.out.println (set);
        System.out.println("HelloWorld!");
    }
}
