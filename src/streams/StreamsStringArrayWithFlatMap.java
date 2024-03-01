package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsStringArrayWithFlatMap {

    public static void main(String[] args) {
       String data[][] = new String[][] {
               {"a", "b"},
               {"c", "d"},
               {"e", "f"},
               {"g", "h"}
       };

       Stream<String[]> dataStream = Arrays.stream(data);

       // Apply Flat Map on Data Stream

       Stream<String> dataStreamMap = dataStream.flatMap(x -> Arrays.stream(x));

       Stream<String> dataStreamFilter = dataStreamMap.filter(x -> "e".equals(x.toString()));

       dataStreamFilter.forEach(System.out::println);


       Stream<String> finalStream = Arrays.stream(data)
                                          .flatMap(x -> Arrays.stream(x))
                                          .filter(x -> "e".equals(x.toString()));

       finalStream.forEach(System.out::println);

    }
}
