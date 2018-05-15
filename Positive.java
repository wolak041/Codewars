import java.util.stream.IntStream;

class Positive {

    static int sum(int[] array) {
        return IntStream.of(array)
                .filter(s -> s > 0)
                .sum();
    }

}
