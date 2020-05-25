import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String expression ="[a-z0-9_]{6,}";
        String input="dinhphu";
        Boolean checkAccount= Pattern.matches(expression,input);
        System.out.println(checkAccount);
    }
}
