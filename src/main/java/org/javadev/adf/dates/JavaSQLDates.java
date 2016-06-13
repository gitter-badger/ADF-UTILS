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
        
    // Year
    
    public static java.sql.Date getFirstDayOfThisQuarter() {
        return new java.sql.Date(JavaUtilDates.getFirstDayOfThisQuarter().getTime());
    }
    
    public static java.sql.Date getLastDayOfThisQuarter() {
        return new java.sql.Date(JavaUtilDates.getLastDayOfThisQuarter().getTime());
    }
    
    // ------------------------------------------------------
    
    public static java.sql.Date getFirstDayOfPreviousQuarter() {
        return new java.sql.Date(JavaUtilDates.getFirstDayOfPreviousQuarter().getTime());
    }
    
    public static java.sql.Date getLastDayOfPreviousQuarter() {
        return new java.sql.Date(JavaUtilDates.getLastDayOfPreviousQuarter().getTime());
    }
    
    // ------------------------------------------------------
    
    
    public static java.sql.Date getFirstDayOfNextQuarter() {
        return new java.sql.Date(JavaUtilDates.getFirstDayOfNextQuarter().getTime());
    }
    
    public static java.sql.Date getLastDayOfNextQuarter() {
        return new java.sql.Date(JavaUtilDates.getLastDayOfNextQuarter().getTime());
    }

    
    // ------------------------------------------------------
        
    // Year
    
    public static java.sql.Date getFirstDayOfThisYear() {
        return new java.sql.Date(JavaUtilDates.getFirstDayOfThisYear().getTime());
    }
    
    public static java.sql.Date getLastDayOfThisYear() {
        return new java.sql.Date(JavaUtilDates.getLastDayOfThisYear().getTime());
    }
    
    // ------------------------------------------------------
    
    public static java.sql.Date getFirstDayOfPreviousYear() {
        return new java.sql.Date(JavaUtilDates.getFirstDayOfPreviousYear().getTime());
    }
    
    public static java.sql.Date getLastDayOfPreviousYear() {
        return new java.sql.Date(JavaUtilDates.getLastDayOfPreviousYear().getTime());
    }
    
    // ------------------------------------------------------
    
    
    public static java.sql.Date getFirstDayOfNextYear() {
        return new java.sql.Date(JavaUtilDates.getFirstDayOfNextYear().getTime());
    }
    
    public static java.sql.Date getLastDayOfNextYear() {
        return new java.sql.Date(JavaUtilDates.getLastDayOfNextYear().getTime());
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
        
        System.out.println();
        System.out.println("Quarter:");
        System.out.println();
        
        System.out.println(" First Day of This Quarter: " + DatesConverter.getCurrentFormattedDate(getFirstDayOfThisQuarter()));
        System.out.println(" Last Day of This Quarter: " + DatesConverter.getCurrentFormattedDate(getLastDayOfThisQuarter()));
        
        System.out.println();
        
        System.out.println(" First Day of Previous Quarter: " + DatesConverter.getCurrentFormattedDate(getFirstDayOfPreviousQuarter()));
        System.out.println(" Last Day of Previous Quarter: " + DatesConverter.getCurrentFormattedDate(getLastDayOfPreviousQuarter()));
        
        System.out.println();
        
        System.out.println(" First Day of Next Quarter: " + DatesConverter.getCurrentFormattedDate(getFirstDayOfNextQuarter()));
        System.out.println(" Last Day of Next Quarter: " + DatesConverter.getCurrentFormattedDate(getLastDayOfNextQuarter()));
        
        System.out.println();
        System.out.println("Year:");
        System.out.println();
        
        System.out.println(" First Day of This Year: " + DatesConverter.getCurrentFormattedDate(getFirstDayOfThisYear()));
        System.out.println(" Last Day of This Year: " + DatesConverter.getCurrentFormattedDate(getLastDayOfThisYear()));
        
        System.out.println();
        
        System.out.println(" First Day of Previous Year: " + DatesConverter.getCurrentFormattedDate(getFirstDayOfPreviousYear()));
        System.out.println(" Last Day of Previous Year: " + DatesConverter.getCurrentFormattedDate(getLastDayOfPreviousYear()));
        
        System.out.println();
        
        System.out.println(" First Day of Next Year: " + DatesConverter.getCurrentFormattedDate(getFirstDayOfNextYear()));
        System.out.println(" Last Day of Next Year: " + DatesConverter.getCurrentFormattedDate(getLastDayOfNextYear()));
        

    }
    
    
} // The End of Class;
