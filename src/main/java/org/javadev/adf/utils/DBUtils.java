package org.javadev.adf.utils;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.DBTransaction;

import org.javadev.adf.utils.vo.CONSTANTS_VO;

public class DBUtils {
        
    public static DBTransaction getDBTransaction(){
        ApplicationModuleImpl am = (ApplicationModuleImpl)ADFUtils.getApplicationModuleForDataControl(CONSTANTS_VO.AppModuleName);
        DBTransaction db = null;
        db = am.getDBTransaction();            
        return db;
    }
    
} // The End of Class;
