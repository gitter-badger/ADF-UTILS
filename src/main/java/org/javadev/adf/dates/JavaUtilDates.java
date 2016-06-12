package org.javadev.adf.dates;

import java.util.Calendar;
import org.javadev.adf.dates.utils.DatesConverter;
import java.util.GregorianCalendar;

import org.javadev.adf.dates.periods.JavaUtilPeriodWeek;


public class JavaUtilDates {
    
    public static java.util.Date getToday() {
       Calendar today = new GregorianCalendar();
       DatesConverter.clearGregorianCalendarTime(today);
       return today.getTime();
   }
    
    public static java.util.Date getYesterday() {
       return DatesConverter.getTodayOffsetDays(-1);
    }
    
    public static java.util.Date getTomorrow() {
       return DatesConverter.getTodayOffsetDays(1);
    }
    
    // --------------------------------------
    
    public static java.util.Date getFirstDayOfThisWeek() {
       return JavaUtilPeriodWeek.getFirstDayOfWeek(getToday());
    }
    
    public static java.util.Date getLastDayOfThisWeek() {
        return JavaUtilPeriodWeek.getLastDayOfWeek(getToday());
    }


} // The End of Class;
