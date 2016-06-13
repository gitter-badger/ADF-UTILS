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
        
    // Months
    
    public static java.sql.Date getFirstDayOfThisMonth() {
        return new java.sql.Date(JavaUtilDates.getFirstDayOfThisMonth().getTime());
    }
    
    public static java.sql.Date getLastDayOfThisMonth() {
        return new java.sql.Date(JavaUtilDates.getLastDayOfThisMonth().getTime());
    }
    
    // ------------------------------------------------------
    
    public static java.sql.Date getFirstDayOfPreviousMonth() {
        return new java.sql.Date(JavaUtilDates.getFirstDayOfPreviousMonth().getTime());
    }
    
    public static java.sql.Date getLastDayOfPreviousMonth() {
        return new java.sql.Date(JavaUtilDates.getLastDayOfPreviousMonth().getTime());
    }
    
    // ------------------------------------------------------
    
    
    public static java.sql.Date getFirstDayOfNextMonth() {
        return new java.sql.Date(JavaUtilDates.getFirstDayOfNextMonth().getTime());
    }
    
    public static java.sql.Date getLastDayOfNextMonth() {
        return new java.sql.Date(JavaUtilDates.getLastDayOfNextMonth().getTime());
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
        
        System.out.println();
        System.out.println("Months:");
        System.out.println();
        
        System.out.println(" First Day of This Month: " + DatesConverter.getCurrentFormattedDate(getFirstDayOfThisMonth()));
        System.out.println(" Last Day of This Month: " + DatesConverter.getCurrentFormattedDate(getLastDayOfThisMonth()));
        
        System.out.println();
        
        System.out.println(" First Day of Previous Month: " + DatesConverter.getCurrentFormattedDate(getFirstDayOfPreviousMonth()));
        System.out.println(" Last Day of Previous Month: " + DatesConverter.getCurrentFormattedDate(getLastDayOfPreviousMonth()));
        
        System.out.println();
        
        System.out.println(" First Day of Next Month: " + DatesConverter.getCurrentFormattedDate(getFirstDayOfNextMonth()));
        System.out.println(" Last Day of Next Month: " + DatesConverter.getCurrentFormattedDate(getLastDayOfNextMonth()));

    }
    
    
} // The End of Class;
