import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String expression="^[a-zA-Z]+[0-9A-Za-z]*@[\\w]{2,7}.(com|org|vn)$";
        String input= "ndp17hp@gmail.com";
        Boolean checkEmail = Pattern.matches(expression,input);
        System.out.println(checkEmail);
    }
}
