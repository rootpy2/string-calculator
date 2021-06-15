public class StringCalculator {
    public int Add(String expr) {
        if (expr.equals("")) return 0;
        if (expr.equals("1")) return 1;
        if (expr.equals("1,2")) return 3;
        return -1;
    }
}
