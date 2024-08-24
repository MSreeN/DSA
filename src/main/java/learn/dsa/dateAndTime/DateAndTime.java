package learn.dsa.dateAndTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAndTime {
    public static void main(String[] args) {
        dateAndTimeAccordingToZone();
    }

    public static void dateAndTimeAccordingToZone(){
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("US/Eastern"));
        System.out.println(zonedDateTime.toLocalDateTime().toLocalTime());
    }
}
