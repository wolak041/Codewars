import java.util.stream.IntStream;

class ReversedSequence {

    static int[] reverse(int n) {

        return IntStream.range(-n, 0).map(Math::abs).toArray();

    }

}