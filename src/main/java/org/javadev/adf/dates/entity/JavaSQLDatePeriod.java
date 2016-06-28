package org.javadev.adf.dates.entity;

import java.sql.Date;

import org.javadev.adf.dates.CONSTANTS_DATES;
import org.javadev.adf.dates.JavaSQLDates;

public class JavaSQLDatePeriod {
    
    
    java.sql.Date date1;
    
    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public Date getDate1() {
        return date1;
    }
    
    // -----------------------------------

    java.sql.Date date2;

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public Date getDate2() {
        return date2;
    }
    
    // -----------------------------------

    String periodName;
    
    public void setPeriodName(String periodName) {
        this.periodName = periodName;
    }

    public String getPeriodName() {
        return periodName;
    }
    
    // -----------------------------------
    
    public JavaSQLDatePeriod(java.sql.Date date1, java.sql.Date date2) {
        this.date1 = date1;
        this.date2 = date2;
    }

    // -----------------------------------
    
    public JavaSQLDatePeriod(String periodName) {
        
        // TODO: All needed period
        
        if (periodName.equals(CONSTANTS_DATES.THIS_WEEK)){
            
            this.date1 = JavaSQLDates.getFirstDayOfThisWeek();
            this.date2 = JavaSQLDates.getLastDayOfThisWeek();
            
            this.periodName = CONSTANTS_DATES.THIS_WEEK;
        }
    }

} // The End of Class;
