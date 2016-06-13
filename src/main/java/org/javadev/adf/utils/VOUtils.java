package org.javadev.adf.utils;

import oracle.jbo.ApplicationModule;
import oracle.jbo.ViewObject;
import oracle.jbo.VariableValueManager;
import oracle.jbo.Variable;
import oracle.jbo.Row;

public class VOUtils {
    
    
    ///////////////////////////////////////////////
    // View Objects
    ///////////////////////////////////////////////
    
    // Print
    
    
    public static void printViewObjectInfo(String voName){
        printViewObjectInfo(getViewObjectByName(voName));
    }
    
    public static void printViewObjectInfo(ViewObject vo){
       System.out.println();
       System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
       System.out.println("# ViewObject : " + vo.getName());
       
       printViewObjectSQLQuery(vo);
       printViewObjectVariables(vo);
       printViewObjectData(vo);
       
       System.out.println();
       System.out.println("ViewObject : " + vo.getName());
       System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
    
    private static void printViewObjectSQLQuery(ViewObject vo){
           System.out.println();
           System.out.println("==================");
           System.out.println("=== Query: ====");
           System.out.println(vo.getQuery());
           System.out.println("==================");
    }
    
    private static void printViewObjectVariables(ViewObject vo) {
        VariableValueManager ensureVariableManager = vo.ensureVariableManager();
        Variable[] lVariables = ensureVariableManager.getVariables();
        int count = ensureVariableManager.getVariableCount();

        // if variables found dump them
        if (count > 0)
        {
            
            System.out.println();
            System.out.println("  Variables:");
            System.out.println();
            
            for (int ii = 0; ii < count; ii++)
            {
                Object lObject = ensureVariableManager.getVariableValue(lVariables[ii]);
                System.out.println("\t# Name: " + lVariables[ii].getName() + " Value: " +
                                   (lObject != null ?  lObject.toString() : "null"));
            }
        }
    }
    
    
    private static void printViewObjectData(ViewObject vo){
           System.out.println();
           System.out.println("=== ViewObject DATA =====");
           System.out.println("Rows Count " + vo.getRowCount());
           
           vo.reset();
           vo.first();
           
        System.out.println("=== VO DATA =====");

           while (vo.getCurrentRow() != null) {
               
                Row row = vo.getCurrentRow();
                String rowDataStr = "";
               
                int numAttrs = vo.getAttributeCount();
               
                for (int columnNo = 0; columnNo < numAttrs; columnNo++){
                     Object attrData = row.getAttribute(columnNo);
                     rowDataStr += (attrData + "\t");
                  }
               
                  System.out.println((vo.getCurrentRowIndex() + 1) + ") " + rowDataStr);
               
               vo.next();
            }

            System.out.println("=== NO MORE DATA =====");
    }
    
    // GET
        
    public static ViewObject getViewObjectByName(String ViewObjectName) {
        ApplicationModule am = ADFUtils.getApplicationModuleForDataControl("AppModuleDataControl");
        ViewObject vo = am.findViewObject(ViewObjectName); 
        return vo;
    }
    
    
} // The End of Class;
