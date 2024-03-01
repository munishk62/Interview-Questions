package streams;
import java.util.stream.IntStream;

public class range {

    public static void main(String... args) {
        System.out.println("Method 1");
        IntStream.range(1, 10).forEach(
                val -> System.out.println(val)
        );

        System.out.println("Method 2");
        //range excludes the
        IntStream.range(1, 10).forEach(System.out::println);

        System.out.println("Using rangeClosed");
        //rangeClosed includes the number
        IntStream.rangeClosed(1, 10).forEach(System.out::println);
    }
}
