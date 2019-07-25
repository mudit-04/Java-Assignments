import java.util.regex.Pattern;

public class Regex {
    public boolean patternMatching(String str){
        boolean isMatch = Pattern.matches("^\\p{Upper}.*[/.]$",str);
        return isMatch;
    }
}
