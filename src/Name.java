
import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class Name {
    private static final String CLASS_NAME_REGEX = "^[C][0-9]{4}[GHIK]$";

    public Name() {
    }

    public boolean isValidate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}