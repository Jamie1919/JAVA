/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author jaypr
 */
public class dateObject {

    public static void main(String[] args) {
        //LocalDate myDate = LocalDate.now();
        //MinguoDate mDate = MinguoDate.from(myDate);
        // System.out.println("Minguo date: " + mDate);

        LocalDateTime myDate = LocalDateTime.now();
        System.out.println("Todasy :" + myDate);
        myDate.minusMonths(15);
        myDate.plusDays(8);
        System.out.println("Minus 9 months: " + myDate);

        String sdate = myDate.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date in ISO_DATE_TIME format: " + sdate);

        String fDate = myDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Formatted with LONG FormatStyle: "+ fDate);
    }
}
