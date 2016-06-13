package org.javadev.adf.dates.utils;

import java.text.SimpleDateFormat;

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
    
    //Format "MMMMM dd, yyyy"
    public static String getCurrentFormattedDate(java.sql.Date date) {
        return getFormattedDate(date, "dd-MM-yyyy");
    } //getCurrentFormattedDate
    
    //Format Example - "d MMM yyyy", "d MMM yyyy hh:mm aaa"
    public static String getFormattedDate(Date date, String format) {
          SimpleDateFormat sdf = new SimpleDateFormat(format);
          return sdf.format(date);
    } //getFormattedDate
    
    ////////////////////////////////////////////////////
    
    
       //Get today's date offset by days
       public static Date getTodayOffsetDays(int days) {
           Calendar cal = Calendar.getInstance();
           cal.setTime(JavaUtilDates.getToday());
           cal.add(Calendar.DATE, days);
           return (cal.getTime());
       } //getTodayOffsetDays
       
       //Get input date offset by days
       public static Date getOffsetDays(Date date, int days) {
           Calendar cal = Calendar.getInstance();
           cal.setTime(date);
           cal.add(Calendar.DATE, days);
           
           return cal.getTime();
       } //getOffsetDays

        // ----------------------------

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

