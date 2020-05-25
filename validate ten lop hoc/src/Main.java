import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String expression="^(C|A|P)[0-9]{4}(G|H|I|K|L|M)$";
        String input= "M0318G";
        Boolean check= Pattern.matches(expression,input);
        System.out.println(check);
    }
}
