package org.javadev.adf.dates.periods;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.javadev.adf.dates.utils.DatesConverter;

public class JavaUtilPeriodWeek {
    
    
    public static java.util.Date getFirstDayOfWeek(java.util.Date date) {
        
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);

        int day_of_week = (cal.get(Calendar.DAY_OF_WEEK) - 2);
        
        cal.add(Calendar.DAY_OF_MONTH, - day_of_week);

        Calendar first_day_of_week = 
            new GregorianCalendar(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
    
        DatesConverter.clearGregorianCalendarTime(first_day_of_week);
        
        return first_day_of_week.getTime();
    }
    
    
    public static java.util.Date getLastDayOfWeek(java.util.Date date) {
        
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);

        int day_of_week = (8 - cal.get(Calendar.DAY_OF_WEEK));
                
        cal.add(Calendar.DAY_OF_MONTH, day_of_week);

        Calendar last_day_of_week = 
                    new GregorianCalendar(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
            
        return last_day_of_week.getTime();
    }
    
    
} // The End of Class;
