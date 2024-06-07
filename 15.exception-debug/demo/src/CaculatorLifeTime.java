import java.time.LocalDate;

public class CaculatorLifeTime {
    private String messenger = "";
    public int getDaysLived(int date, int month, int year) throws Exception {
        if (!isValidDate(date, month, year)) throw new Exception(messenger);

        LocalDate currentDate = LocalDate.now();
        int currentDays = currentDate.getDayOfMonth() + currentDate.getMonthValue() * 30 + currentDate.getYear() * 365;
        int yourDaysLived = currentDays - (date + month * 30 + year * 365);
        if (yourDaysLived < 0) throw new Exception("Invalid input");

        return yourDaysLived;
    }

    private boolean isValidDate(int date, int month, int year) {
        if (year > 2024 || year < 0) {
            messenger += "Invalid year\n";
            return false;
        }
        if (month > 12 || month < 0) {
            messenger += "Invalid month\n";
            return false;
        }

        if (date > 31 || date < 0) {
            messenger += "Invalid date";
            return false;
        }
        return true;
    }
}
