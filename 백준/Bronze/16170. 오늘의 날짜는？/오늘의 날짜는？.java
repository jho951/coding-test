import java.time.LocalDate;
import java.time.ZoneOffset;

public class Main {
    public static void main(String[] args) {
        LocalDate utcDate = LocalDate.now(ZoneOffset.UTC);
        
        int year = utcDate.getYear();
        int month = utcDate.getMonthValue(); // 1 ~ 12
        int day = utcDate.getDayOfMonth();

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
}