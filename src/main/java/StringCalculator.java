import java.util.Arrays;

public class StringCalculator {
    public int Add(String expr) {
        if ("".equals(expr)) return 0;

        return Arrays
                .stream(expr.split(","))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
