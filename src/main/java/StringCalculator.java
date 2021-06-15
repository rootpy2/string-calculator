import java.util.Arrays;

public class StringCalculator {
    public int Add(String expr) {
        if ("".equals(expr)) return 0;

        String regex = "\n|,";
        return Arrays
                .stream(expr.split(regex))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
