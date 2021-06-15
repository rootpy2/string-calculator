import java.util.Arrays;
import java.util.stream.Collectors;

public class StringCalculator {
    private int calledCount = 0;

    public int Add(String expr) {
        this.calledCount++;
        if ("".equals(expr)) return 0;

        String default_delimiter = "\n|,";

        // If Delimiter is defined, update delimiter and expr
        if (expr.contains("//")) {
            final int endIndex = expr.indexOf("\n");
            default_delimiter = expr.substring(2, endIndex);

            // check for multiple delimiter
            if (default_delimiter.contains("[")) {

                final String delimiter_regex = "\\]|\\[";
                default_delimiter = Arrays.stream(default_delimiter.split(delimiter_regex))
                        .filter(s -> !"".equals(s)).collect(Collectors.joining("|"));
            }
            expr = expr.substring(endIndex + 1);
        }

        // handle dangling meta character
        if (default_delimiter.contains("*")) {
            default_delimiter = default_delimiter.replaceAll("\\*", "\\\\*");
        }

        if (expr.contains("-")) {
            String negativeNumbers = Arrays.stream(expr.split(default_delimiter))
                    .map(Integer::parseInt)
                    .filter(number -> number < 0)
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));

            throw new IllegalArgumentException(String.format("negatives not allowed: %s", negativeNumbers));
        }

        return Arrays
                .stream(expr.split(default_delimiter))
                .mapToInt(Integer::parseInt)
                .filter(number -> number <= 1000)
                .sum();
    }

    public int GetCalledCount() {
        return this.calledCount;
    }
}
