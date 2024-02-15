import java.util.HashMap;
import java.util.Map;

public class Handson {

    public static void main(String args[]) {
        Map map = new HashMap<String,Integer>();
        final int DEFAULT_INITIAL_CAPACITY = 1 << 2;
        /*meaning of 1 << 2 is binary operation.
        * so 1 -> 0001
        * << means left shift and 2 means 2 positions
        *  so 0001 moving two positions becomes 0100 which is 4*/
        System.out.println(DEFAULT_INITIAL_CAPACITY);
    }
}
