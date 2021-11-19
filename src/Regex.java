import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regex {
    public static void main(String[] args){
        Pattern p = Pattern.compile("^M.");
        Matcher m = p.matcher("Ma");
        boolean result = m.matches();
        System.out.println(result);
    }
}

