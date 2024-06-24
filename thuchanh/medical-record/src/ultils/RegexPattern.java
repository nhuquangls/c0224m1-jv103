package ultils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
    private static final String DATE_PATTERN = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";

    public static boolean isValidDate(String dateStr) {
        Pattern pattern = Pattern.compile(DATE_PATTERN);
        Matcher matcher = pattern.matcher(dateStr);
        return matcher.matches();
    }

}
