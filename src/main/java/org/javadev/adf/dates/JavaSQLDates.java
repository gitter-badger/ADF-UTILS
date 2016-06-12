package org.javadev.adf.dates;

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
    
    // ------------------------------------------------------
    
    public static java.sql.Date getFirstDayOfThisWeek() {
        return new java.sql.Date(JavaUtilDates.getFirstDayOfThisWeek().getTime());
    }
    
    public static java.sql.Date getLastDayOfThisWeek() {
        return new java.sql.Date(JavaUtilDates.getLastDayOfThisWeek().getTime());
    }
    
    // ------------------------------------------------------
        
        
    public void printAllDates() {

        System.out.println("TODAY: " + getToday());
        System.out.println("YESTERDAY: " + getYesterday());
        System.out.println("TOMORROW: " + getTomorrow());
        
        System.out.println();
        
        System.out.println(" First Day of This Week " + getFirstDayOfThisWeek());
        System.out.println(" Last Day of This Week " + getLastDayOfThisWeek());

    }
    
    
} // The End of Class;
