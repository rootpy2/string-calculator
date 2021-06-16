public class Main {
    public static void main(String[] args) {
        String input = args[0];
        // handling \n character
        input = input.replace("n", "");
        input = input.replace("\\", "\n");

        StringCalculator calculator = new StringCalculator();
        System.out.printf("Sum: %d%n", calculator.Add(input));
    }
}
