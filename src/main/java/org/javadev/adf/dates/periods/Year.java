package org.javadev.adf.dates.periods;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Year {
    
    
    public static java.util.Date getFirstDayOfYear(java.util.Date date) {
               
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        
        return new GregorianCalendar(cal.get(Calendar.YEAR), Calendar.JANUARY, 1).getTime();
    }
    
    
    public static java.util.Date getLastDayOfYear(java.util.Date date) {
        
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        
        return new GregorianCalendar(cal.get(Calendar.YEAR), Calendar.DECEMBER, 31).getTime();
    }
    
} // The End of Class;
