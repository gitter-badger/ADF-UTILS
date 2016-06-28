package org.javadev.adf.dates.periods;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.javadev.adf.dates.utils.DatesConverter;

public class Weeks {
    
    
    public static java.util.Date getFirstDayOfWeek(java.util.Date date) {
        
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        Calendar first_day_of_week = 
            new GregorianCalendar(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
    
        return first_day_of_week.getTime();
    }
    
    
    public static java.util.Date getLastDayOfWeek(java.util.Date date) {
        
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);

        cal.setFirstDayOfWeek(Calendar.MONDAY);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);

        Calendar last_day_of_week = 
                    new GregorianCalendar(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
            
        return last_day_of_week.getTime();
    }
    
    
} // The End of Class;
