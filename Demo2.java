import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {
    public static void main(String[] args) {
        String text1 = "My Customer id: C-123";
        String text2 = "C-450";

        Pattern compile = Pattern.compile("C-\\d{3}");
        Matcher matcher = compile.matcher(text1);
        Matcher matcher2 = compile.matcher(text2);

       /*1 */ System.out.println(matcher.matches());
            matcher.reset();
            System.out.println(matcher.find());

        System.out.println(matcher2.matches());
        matcher2.reset();
        System.out.println(matcher2.find());

        // System.out.println("------------------------"); 
        // System.out.println(Pattern.matches("C-\\d{3}"),text1);  ----> another shortcut
        // System.out.println(Pattern.matches("C-\\d{3}"),text2);

        System.out.println(text1.matches("C-\\d{3}")); // shortcut of 1
        System.out.println(text2.matches("C-\\d{3}"));

    }
}
