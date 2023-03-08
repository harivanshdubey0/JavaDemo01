package myjavaproject;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Calandar {

	public static void main(String[] args) {
		
        //year, month, day, week, time
        LocalDate localdate1 =LocalDate.now();
        System.out.println("Todays date :"+ localdate1);
        LocalDate localDate2 =LocalDate.now((ZoneId.of("Asia/Kolkata")));
        System.out.println("Todays date :"+ localDate2);

        LocalTime localdate3 =LocalTime.now();
        System.out.println("Todays date :"+ localdate3);
        LocalTime localDate4 =LocalTime.now((ZoneId.of("Asia/Kolkata")));
        System.out.println("Todays date :"+ localDate4);

        LocalDateTime localdate5 =LocalDateTime.now();
        System.out.println("Todays date 5:"+ localdate5);
        LocalDateTime localDate6 =LocalDateTime.now((ZoneId.of("Asia/Karachi")));
        System.out.println("Todays date :"+ localDate6);
        LocalDateTime localDate7 =LocalDateTime.now((ZoneId.of("Europe/London")));
        System.out.println("Todays date in London :"+ localDate7);
        //${__javaScript(v = new Date(); (v.getYear()+1900)+(v.getMonth()+1<10?"0":"")+(v.getMonth()+1)+(v.getDate()<10?"0":"")+(v.getDate()))}


        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(LocalDate.from(europeanDateFormatter.parse("15.08.2014")).isLeapYear());
       // System.out.println(LocalDate.from(europeanDateFormatter.ofPattern("yyyymmdd").LocalDate.now());

        System.out.println(LocalDateTime.now());
        // Formater Asim needs to use
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        System.out.println(LocalDate.now().format(formatter));
        String  Date= LocalDate.now().format(formatter);

        int count = 0;
        while (count <=100000)
        {
            System.out.println("" + count++);
            System.out.println(Date+count);
        }

	}

}
