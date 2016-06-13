package org.javadev.adf.dates.entity;

import java.sql.Date;

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
    
    public JavaSQLDatePeriod(java.sql.Date date1, java.sql.Date date2) {
        this.date1 = date1;
        this.date2 = date2;
    }

    
} // The End of Class;
