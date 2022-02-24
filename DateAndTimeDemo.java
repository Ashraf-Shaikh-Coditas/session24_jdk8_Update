package Week6.Session24_JDK_8_UPDATE;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateAndTimeDemo {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        System.out.println("Current date is :: "+d1);

        LocalTime t1 =LocalTime.now();
        System.out.println("Current time is :: "+t1);

        LocalDateTime td1 = LocalDateTime.now();
        System.out.println("Current date and time is :: "+td1);

        Month m1 = td1.getMonth();
        System.out.println("Month is :: "+m1);

        int day = td1.getDayOfMonth();
        System.out.println("Day is :: "+day);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatedDate = td1.format(format);
        System.out.println("Date After Formatting: " + formatedDate);

    }
}

/*

Current date is :: 2022-02-23
Current time is :: 22:29:51.621255800
Current date and time is :: 2022-02-23T22:29:51.621255800
Month is :: FEBRUARY
Day is :: 23
Date After Formatting: 23-02-2022 22:29:51

* */