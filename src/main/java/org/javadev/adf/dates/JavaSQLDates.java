package org.javadev.adf.dates;

import org.javadev.adf.dates.utils.DatesConverter;

public class JavaSQLDates {
    
    
    public static java.sql.Date getToday() {
       return new java.sql.Date(JavaUtilDates.getToday().getTime());
    }
    
    public static java.sql.Date getYesterday() {
        return new java.sql.Date(JavaUtilDates.getYesterday().getTime());
    }
    
    public static java.sql.Date getTomorrow() {
        return new java.sql.Date(JavaUtilDates.getTomorrow().getTime());
    }
    
    // Weeks
    
    public static java.sql.Date getFirstDayOfThisWeek() {
        return new java.sql.Date(JavaUtilDates.getFirstDayOfThisWeek().getTime());
    }
    
    public static java.sql.Date getLastDayOfThisWeek() {
        return new java.sql.Date(JavaUtilDates.getLastDayOfThisWeek().getTime());
    }
    
    // ------------------------------------------------------
    
    public static java.sql.Date getFirstDayOfPreviousWeek() {
        return new java.sql.Date(JavaUtilDates.getFirstDayOfPreviousWeek().getTime());
    }
    
    public static java.sql.Date getLastDayOfPreviousWeek() {
        return new java.sql.Date(JavaUtilDates.getLastDayOfPreviousWeek().getTime());
    }
    
    // ------------------------------------------------------
    
    
    public static java.sql.Date getFirstDayOfNextWeek() {
        return new java.sql.Date(JavaUtilDates.getFirstDayOfNextWeek().getTime());
    }
    
    public static java.sql.Date getLastDayOfNextWeek() {
        return new java.sql.Date(JavaUtilDates.getLastDayOfNextWeek().getTime());
    }
    
    // ------------------------------------------------------
        
        
    public static void printAllDates() {

        System.out.println();
        System.out.println("DATES: ");
        System.out.println();

        System.out.println(" TODAY: " + DatesConverter.getCurrentFormattedDate(getToday()));
        System.out.println(" YESTERDAY: " + DatesConverter.getCurrentFormattedDate(getYesterday()));
        System.out.println(" TOMORROW: " + DatesConverter.getCurrentFormattedDate(getTomorrow()));
        
        System.out.println();
        System.out.println("Weeeks:");
        System.out.println();
        
        System.out.println(" First Day of This Week: " + DatesConverter.getCurrentFormattedDate(getFirstDayOfThisWeek()));
        System.out.println(" Last Day of This Week: " + DatesConverter.getCurrentFormattedDate(getLastDayOfThisWeek()));
        
        System.out.println();
        
        System.out.println(" First Day of Previous Week: " + DatesConverter.getCurrentFormattedDate(getFirstDayOfPreviousWeek()));
        System.out.println(" Last Day of Previous Week: " + DatesConverter.getCurrentFormattedDate(getLastDayOfPreviousWeek()));
        
        System.out.println();
        
        System.out.println(" First Day of Next Week: " + DatesConverter.getCurrentFormattedDate(getFirstDayOfNextWeek()));
        System.out.println(" Last Day of Next Week: " + DatesConverter.getCurrentFormattedDate(getLastDayOfNextWeek()));

    }
    
    
} // The End of Class;
