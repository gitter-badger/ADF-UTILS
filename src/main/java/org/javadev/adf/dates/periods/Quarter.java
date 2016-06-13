package org.javadev.adf.dates.periods;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Quarter {
    
    public static java.util.Date getFirstDayOfQuarter(java.util.Date date) {
               
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);

        Integer monthDifference = 0;

        if (cal.get(cal.MONTH) == cal.JANUARY || cal.get(cal.MONTH) == cal.APRIL ||
                cal.get(cal.MONTH) == cal.JULY || cal.get(cal.MONTH) == cal.OCTOBER) {
            monthDifference = 0;
        } else if (cal.get(cal.MONTH) == cal.FEBRUARY || cal.get(cal.MONTH) == cal.MAY ||
                cal.get(cal.MONTH) == cal.AUGUST || cal.get(cal.MONTH) == cal.NOVEMBER) {
            monthDifference = 1;
        } else if (cal.get(cal.MONTH) == cal.MARCH || cal.get(cal.MONTH) == cal.JUNE ||
                cal.get(cal.MONTH) == cal.SEPTEMBER || cal.get(cal.MONTH) == cal.DECEMBER) {
            monthDifference = 2;
        } 
            
        return new GregorianCalendar(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) - monthDifference, 1).getTime();
    }
    
    
    public static java.util.Date getLastDayOfQuarter(java.util.Date date) {
        
        Calendar inputDate = new GregorianCalendar();
        inputDate.setTime(date);
        
        Integer monthDifference = 0;

        if (inputDate.get(inputDate.MONTH) == inputDate.JANUARY || inputDate.get(inputDate.MONTH) == inputDate.APRIL ||
                inputDate.get(inputDate.MONTH) == inputDate.JULY || inputDate.get(inputDate.MONTH) == inputDate.OCTOBER) {
            monthDifference = 2;
        } else if (inputDate.get(inputDate.MONTH) == inputDate.FEBRUARY || inputDate.get(inputDate.MONTH) == inputDate.MAY ||
                inputDate.get(inputDate.MONTH) == inputDate.AUGUST || inputDate.get(inputDate.MONTH) == inputDate.NOVEMBER) {
            monthDifference = 1;
        } else if (inputDate.get(inputDate.MONTH) == inputDate.MARCH || inputDate.get(inputDate.MONTH) == inputDate.JUNE ||
                inputDate.get(inputDate.MONTH) == inputDate.SEPTEMBER || inputDate.get(inputDate.MONTH) == inputDate.DECEMBER) {
            monthDifference = 0;
        } 
        
        Calendar firstDayOfLastMontOfQuarter = new GregorianCalendar(inputDate.get(Calendar.YEAR), inputDate.get(Calendar.MONTH) + monthDifference, 1);
                     
        return new GregorianCalendar(firstDayOfLastMontOfQuarter.get(Calendar.YEAR), firstDayOfLastMontOfQuarter.get(Calendar.MONTH),  firstDayOfLastMontOfQuarter.getActualMaximum(Calendar.DAY_OF_MONTH)).getTime();
    }
    
} // The End of Class;
