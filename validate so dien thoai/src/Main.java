import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String express="^(\\([0-9]{2}\\))-(\\((0){1}[0-9]{9}\\))";
        String input="(84)-(0978489648)";
        String inputFalse="(a8)-(22222222)";
        Boolean check= Pattern.matches(express,inputFalse);

        System.out.println(check);
    }
}
