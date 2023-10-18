import com.google.common.primitives.Booleans;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        boolean arr[] = { true, false, true,
                true, true };
        List<Boolean> myList = Booleans.asList(arr);
        System.out.println(myList);


        boolean arr2[] = { false, true, false };
        List<Boolean> myList2 = Booleans.asList(arr2);
        System.out.println(myList2);
    }
}