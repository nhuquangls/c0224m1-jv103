package ultils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    private static final String RECORD_PATTERN = "^BA-\\d{3}$";
    private static final String PATIENT_ID_PATTERN = "^BN-\\d{3}$";

    public static boolean isValidDate(String dateStr) {
        try {
            DATE_FORMAT.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static boolean isValidRecordID(String recordID) {
        Pattern pattern = Pattern.compile(RECORD_PATTERN);
        Matcher matcher = pattern.matcher(recordID);
        return matcher.matches();
    }

    public static boolean isValidPatientID(String patientID) {
        Pattern pattern = Pattern.compile(PATIENT_ID_PATTERN);
        Matcher matcher = pattern.matcher(patientID);
        return matcher.matches();
    }
}
