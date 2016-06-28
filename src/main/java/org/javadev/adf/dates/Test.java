package org.javadev.adf.dates;

import org.javadev.adf.dates.utils.DatesConverter;

public class Test {


    public static void main(String[] args) {
        
        System.out.println("Test 1");
        
        JavaSQLDates.printAllDates();

        System.out.println();
        System.out.println();

        // This Week
        
        System.out.println("Test 2");
        
        System.out.println();
        
        System.out.println("Period Name: " + new StandartDates().getThisWeek().getPeriodName());
        System.out.println("date1: " + DatesConverter.getCurrentFormattedDate(new StandartDates().getThisWeek().getDate1()));
        System.out.println("date2: " + DatesConverter.getCurrentFormattedDate(new StandartDates().getThisWeek().getDate2()));
        
    }
    
    
    
} // The End of Class;
