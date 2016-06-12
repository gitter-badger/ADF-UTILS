package org.javadev.adf.dates.utils;

import java.util.Calendar;
import java.util.Date;

import org.javadev.adf.dates.JavaUtilDates;

public class DatesConverter {
    
    public static Calendar clearGregorianCalendarTime(Calendar date) {

        date.set(Calendar.HOUR_OF_DAY, 0);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);

        return date;

    }
    
    
    ////////////////////////////////////////////////////
    
    
       //Get today's date offset by days
       public static Date getTodayOffsetDays(int days) {
           Calendar cal = Calendar.getInstance();
           cal.setTime(JavaUtilDates.getToday());
           cal.add(Calendar.DATE, days);
           return (cal.getTime());
       } //getTodayOffsetDays

       //Get today's date offset by months
       public static Date getTodayOffsetMonths(int months) {
           Calendar cal = Calendar.getInstance();
           cal.setTime(JavaUtilDates.getToday());
           cal.add(Calendar.MONTH, months);
           return (cal.getTime());
       } //getTodayOffsetMonths

       //Get today's date offset by years
       public static Date getTodayOffsetYears(int years) {
           Calendar cal = Calendar.getInstance();
           cal.setTime(JavaUtilDates.getToday());
           cal.add(Calendar.YEAR, years);
           return (cal.getTime());
       } //getTodayOffsetYears

       //Get today's date offset by dates, months, years
       public static Date getTodayOffsetDaysMonthsYears(int days, int months, int years) {
           Calendar cal = Calendar.getInstance();
           cal.setTime(JavaUtilDates.getToday());
           cal.add(Calendar.DATE, days);
           cal.add(Calendar.MONTH, months);
           cal.add(Calendar.YEAR, years);
           return (cal.getTime());
       } //getTodayOffsetDaysMonthsYears


} // The End of Class;

