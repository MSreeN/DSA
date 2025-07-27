package learn.dsa.dateAndTime;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
//        dateAndTimeAccordingToZone();
        yearMonthToDateConversion();
    }

    public static void dateAndTimeAccordingToZone(){
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("US/Eastern"));
        System.out.println(zonedDateTime.toLocalDateTime().toLocalTime());
    }

    public static void yearMonthToDateConversion(){
        //convert year month to localdate and minus one month and convert it back to year month
        String yearMonthString = "2024-05";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM");
        YearMonth yearMonth = YearMonth.parse(yearMonthString, formatter);
//        YearMonth yearMonth = YearMonth.par
        LocalDate localDate = YearMonth.now().atDay(LocalDate.now().getDayOfMonth());
        System.out.println(localDate);
        localDate = localDate.minusMonths(1);
        System.out.println(YearMonth.from(localDate));
//        System.out.println(LocalDate.now().getYear());

        //minus one month on yearmonth object
        YearMonth yearMonth1 = YearMonth.parse(yearMonthString, formatter);
        yearMonth1 = yearMonth1.minusMonths(2);
        System.out.println(yearMonth1);

    }
}
