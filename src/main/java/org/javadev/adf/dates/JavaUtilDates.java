package org.javadev.adf.dates;

import java.util.Calendar;
import org.javadev.adf.dates.utils.DatesConverter;
import java.util.GregorianCalendar;

import org.javadev.adf.dates.periods.Months;
import org.javadev.adf.dates.periods.Quarter;
import org.javadev.adf.dates.periods.Weeks;
import org.javadev.adf.dates.periods.Year;


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
       return Weeks.getFirstDayOfWeek(getToday());
    }
    
    public static java.util.Date getLastDayOfThisWeek() {
        return Weeks.getLastDayOfWeek(getToday());
    }
    
    // --------------------------------------
    
    public static java.util.Date getFirstDayOfPreviousWeek() {
       return Weeks.getFirstDayOfWeek(DatesConverter.getOffsetDays(getFirstDayOfThisWeek(), -2));
    }
    
    public static java.util.Date getLastDayOfPreviousWeek() {
        return Weeks.getLastDayOfWeek(DatesConverter.getOffsetDays(getFirstDayOfThisWeek(), -2));
    }
    
    // --------------------------------------
    
    public static java.util.Date getFirstDayOfNextWeek() {
       return Weeks.getFirstDayOfWeek(DatesConverter.getOffsetDays(getLastDayOfThisWeek(), 1));
    }
    
    public static java.util.Date getLastDayOfNextWeek() {
        return Weeks.getLastDayOfWeek(DatesConverter.getOffsetDays(getLastDayOfThisWeek(), 1));
    }
    
    
    // Months
    
    public static java.util.Date getFirstDayOfThisMonth() {
       return Months.getFirstDayOfMonth(getToday());
    }
    
    public static java.util.Date getLastDayOfThisMonth() {
        return Months.getLastDayOfMonth(getToday());
    }
    
    // --------------------------------------
    
    public static java.util.Date getFirstDayOfPreviousMonth() {
       return Months.getFirstDayOfMonth(DatesConverter.getOffsetMonths(getToday(), -1));
    }
    
    public static java.util.Date getLastDayOfPreviousMonth() {
        return Months.getLastDayOfMonth(DatesConverter.getOffsetMonths(getToday(), -1));
    }
    
    // --------------------------------------
    
    public static java.util.Date getFirstDayOfNextMonth() {
       return Months.getFirstDayOfMonth(DatesConverter.getOffsetMonths(getToday(), 1));
    }
    
    public static java.util.Date getLastDayOfNextMonth() {
        return Months.getLastDayOfMonth(DatesConverter.getOffsetMonths(getToday(), 1));
    }
    
    // --------------------------------------
    
    // Quarter
    
    public static java.util.Date getFirstDayOfThisQuarter() {
       return Quarter.getFirstDayOfQuarter(getToday());
    }
    
    public static java.util.Date getLastDayOfThisQuarter() {
        return Quarter.getLastDayOfQuarter(getToday());
    }
    
    
    // --------------------------------------
    
    public static java.util.Date getFirstDayOfPreviousQuarter() {
       return Quarter.getFirstDayOfQuarter(DatesConverter.getOffsetMonths(getFirstDayOfThisQuarter(), -1));
    }
    
    public static java.util.Date getLastDayOfPreviousQuarter() {
        return Quarter.getLastDayOfQuarter(DatesConverter.getOffsetMonths(getFirstDayOfThisQuarter(), -1));
    }
    
    // --------------------------------------
    
    public static java.util.Date getFirstDayOfNextQuarter() {
       return Quarter.getFirstDayOfQuarter(DatesConverter.getOffsetMonths(getLastDayOfThisQuarter(), 1));
    }
    
    public static java.util.Date getLastDayOfNextQuarter() {
        return Quarter.getLastDayOfQuarter(DatesConverter.getOffsetMonths(getLastDayOfThisQuarter(), 1));
    }

    
    // --------------------------------------
    
    // Years
    
    public static java.util.Date getFirstDayOfThisYear() {
       return Year.getFirstDayOfYear(getToday());
    }
    
    public static java.util.Date getLastDayOfThisYear() {
        return Year.getLastDayOfYear(getToday());
    }
    
    
    // --------------------------------------
    
    public static java.util.Date getFirstDayOfPreviousYear() {
       return Year.getFirstDayOfYear(DatesConverter.getOffsetYears(getToday(), -1));
    }
    
    public static java.util.Date getLastDayOfPreviousYear() {
        return Year.getLastDayOfYear(DatesConverter.getOffsetYears(getToday(), -1));
    }
    
    // --------------------------------------
    
    public static java.util.Date getFirstDayOfNextYear() {
       return Year.getFirstDayOfYear(DatesConverter.getOffsetYears(getToday(), 1));
    }
    
    public static java.util.Date getLastDayOfNextYear() {
        return Year.getLastDayOfYear(DatesConverter.getOffsetYears(getToday(), 1));
    }

    
    // --------------------------------------


} // The End of Class;
