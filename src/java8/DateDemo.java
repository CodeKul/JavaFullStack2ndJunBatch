package java8;

import java.time.*;
import java.util.Date;
import java.util.Set;

public class DateDemo {
    public static void main(String[] args) {
        Date date  =new Date();
        System.out.println(date);
        LocalDate localDate = LocalDate.now();
        LocalDate spDate = LocalDate.of(1999, Month.AUGUST,29);
        System.out.println("Sp Date "+spDate);
        System.out.println(localDate);
        System.out.println(LocalDate.parse("2005-05-05"));
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(LocalTime.of(15,55,45));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        Instant instant = Instant.now();
        System.out.println(instant);
        Set<String> zoneId = ZoneId.getAvailableZoneIds();
        zoneId.forEach(zone -> {
            System.out.println(zone+" : "+LocalDateTime.now(ZoneId.of(zone)));
        });

    }
}
