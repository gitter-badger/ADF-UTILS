package org.javadev.adf.dates.periods;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Months {
    
    public static java.util.Date getFirstDayOfMonth(java.util.Date date) {
        
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        
        return new GregorianCalendar(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), 1).getTime();
    }
    
    
    public static java.util.Date getLastDayOfMonth(java.util.Date date) {
        
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        
        return new GregorianCalendar(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.getActualMaximum(Calendar.DAY_OF_MONTH)).getTime();
    }
    
} // The End of Class;
