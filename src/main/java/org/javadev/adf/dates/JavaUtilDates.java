package org.javadev.adf.dates;

import java.util.Calendar;
import org.javadev.adf.dates.utils.DatesConverter;
import java.util.GregorianCalendar;

import org.javadev.adf.dates.periods.JavaUtilPeriodMonths;
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
    
    // Week
    
    public static java.util.Date getFirstDayOfThisWeek() {
       return JavaUtilPeriodWeek.getFirstDayOfWeek(getToday());
    }
    
    public static java.util.Date getLastDayOfThisWeek() {
        return JavaUtilPeriodWeek.getLastDayOfWeek(getToday());
    }
    
    // --------------------------------------
    
    public static java.util.Date getFirstDayOfPreviousWeek() {
       return JavaUtilPeriodWeek.getFirstDayOfWeek(DatesConverter.getOffsetDays(getFirstDayOfThisWeek(), -2));
    }
    
    public static java.util.Date getLastDayOfPreviousWeek() {
        return JavaUtilPeriodWeek.getLastDayOfWeek(DatesConverter.getOffsetDays(getFirstDayOfThisWeek(), -2));
    }
    
    // --------------------------------------
    
    public static java.util.Date getFirstDayOfNextWeek() {
       return JavaUtilPeriodWeek.getFirstDayOfWeek(DatesConverter.getOffsetDays(getLastDayOfThisWeek(), 1));
    }
    
    public static java.util.Date getLastDayOfNextWeek() {
        return JavaUtilPeriodWeek.getLastDayOfWeek(DatesConverter.getOffsetDays(getLastDayOfThisWeek(), 1));
    }
    
    
    // Months
    
    public static java.util.Date getFirstDayOfThisMonth() {
       return JavaUtilPeriodMonths.getFirstDayOfMonth(getToday());
    }
    
    public static java.util.Date getLastDayOfThisMonth() {
        return JavaUtilPeriodMonths.getLastDayOfMonth(getToday());
    }
    
    // --------------------------------------
    
    public static java.util.Date getFirstDayOfPreviousMonth() {
       return JavaUtilPeriodMonths.getFirstDayOfMonth(DatesConverter.getOffsetMonths(getToday(), -1));
    }
    
    public static java.util.Date getLastDayOfPreviousMonth() {
        return JavaUtilPeriodMonths.getLastDayOfMonth(DatesConverter.getOffsetMonths(getToday(), -1));
    }
    
    // --------------------------------------
    
    public static java.util.Date getFirstDayOfNextMonth() {
       return JavaUtilPeriodMonths.getFirstDayOfMonth(DatesConverter.getOffsetMonths(getToday(), 1));
    }
    
    public static java.util.Date getLastDayOfNextMonth() {
        return JavaUtilPeriodMonths.getLastDayOfMonth(DatesConverter.getOffsetMonths(getToday(), 1));
    }
    
    // --------------------------------------


} // The End of Class;
