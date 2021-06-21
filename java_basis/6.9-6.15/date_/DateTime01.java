package date_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime future = now.plusWeeks(3);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateTimeFormatter.format(future));
    }
}
