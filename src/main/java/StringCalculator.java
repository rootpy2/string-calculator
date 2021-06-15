import java.util.Arrays;

public class StringCalculator {
    public int Add(String expr) {
        if ("".equals(expr)) return 0;

        String default_delimiter = "\n|,";

        // If Delimiter is defined, update delimiter and expr
        if (expr.contains("//")) {
            int endIndex = expr.indexOf("\n");
            default_delimiter = expr.substring(2, endIndex);
            expr = expr.substring(endIndex + 1);
        }

        return Arrays
                .stream(expr.split(default_delimiter))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
