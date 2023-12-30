import java.util.Calendar;

public class program53 {
    public static void main(String[] args) {
        int day, month, year;
        int second, minute, hour;

        // Get the current date and time using Calendar.getInstance()
        Calendar calendar = Calendar.getInstance();

        day = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH) + 1;  // Note: Calendar.MONTH is zero-based
        year = calendar.get(Calendar.YEAR);

        second = calendar.get(Calendar.SECOND);
        minute = calendar.get(Calendar.MINUTE);
        hour = calendar.get(Calendar.HOUR_OF_DAY);  // Use HOUR_OF_DAY for 24-hour format

        System.out.println(day + "/" + month + "/" + year);
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
