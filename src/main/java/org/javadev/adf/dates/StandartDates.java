package org.javadev.adf.dates;

import org.javadev.adf.dates.entity.JavaSQLDatePeriod;

public class StandartDates {
    
    JavaSQLDatePeriod thisWeek;


//    public void setThisWeek(JavaSQLDatePeriod thisWeek) {
//        this.thisWeek = thisWeek;
//    }

    public JavaSQLDatePeriod getThisWeek() {
        return new JavaSQLDatePeriod(CONSTANTS_DATES.THIS_WEEK);
    }
    
    
    
    
} // The End of Class;
