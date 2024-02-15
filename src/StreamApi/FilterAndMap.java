/*
* filter method will filter elements in the stream based on condition
* map will perform the function defined on each element
*/

package StreamApi;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMap {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        List<Integer> squaresOfEven = list.stream()
                .filter(n -> n%2==0)
                .map(n -> n*n).collect(Collectors.toList());
        System.out.println(squaresOfEven);
    }

}
