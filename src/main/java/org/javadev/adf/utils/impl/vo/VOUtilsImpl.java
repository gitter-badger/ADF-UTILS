package org.javadev.adf.utils.impl.vo;

import oracle.jbo.ApplicationModule;
import oracle.jbo.ViewObject;
import oracle.jbo.VariableValueManager;
import oracle.jbo.Variable;
import oracle.jbo.Row;

import org.javadev.adf.utils.ADFUtils;

public class VOUtilsImpl {
    
    
    ///////////////////////////////////////////////
    // View Objects
    ///////////////////////////////////////////////
    
    // Print
    
    
    public static void printViewObjectInfo(ViewObject vo){
       System.out.println();
       System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
       System.out.println("# ViewObject : " + vo.getName());
       
       printViewObjectSQLQuery(vo);
       printViewObjectVariables(vo);
       printViewObjectAttributes(vo);
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
    
    
    private static void printViewObjectAttributes(ViewObject vo){
           System.out.println();
           System.out.println("=== ViewObject ATTRIBUTES =====");
           
            vo.reset();
            vo.first();
            Row row = vo.getCurrentRow();
            
            String viewObjName = vo.getName();
                System.out.println("Printing attribute for a row in VO '"+ viewObjName+"'");
                StructureDef def = row.getStructureDef();
                StringBuilder sb = new StringBuilder();
                int numAttrs = def.getAttributeCount();
                AttributeDef[] attrDefs = def.getAttributeDefs();
                for (int z = 0; z < numAttrs; z++) {
                  Object value = row.getAttribute(z);
                  sb.append(z > 0 ? "  " : "")
                    .append(attrDefs[z].getName())
                    .append("=")
                    .append(value == null ? "<null>" : value)
                    .append(z < numAttrs - 1 ? "\n" : "");
                }
                System.out.println(sb.toString());
    
                System.out.println("=== NO MORE ATTRIBUTES =====");
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
    
} // The End of Class;
