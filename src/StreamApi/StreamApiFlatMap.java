/*
* Flatmap in stream provides stream of a stream
* below example will be useful
*/

package StreamApi;


import java.util.Arrays;
import java.util.List;

public class StreamApiFlatMap {
    public  static void main(String[] args){
        List<List<Integer>> listofList = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );

        int sum = listofList.stream()
                .flatMap(List::stream)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("total from list having list "+sum);
        singleList();
    }

    static void singleList(){
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("total from list "+sum);
    }
}
