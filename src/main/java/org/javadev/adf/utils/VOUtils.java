package org.javadev.adf.utils;

import oracle.jbo.ApplicationModule;
import oracle.jbo.ViewCriteriaManager;
import oracle.jbo.ViewObject;

import org.javadev.adf.utils.impl.vo.CONSTANTS_VO;
import org.javadev.adf.utils.impl.vo.VCUtilsImpl;
import org.javadev.adf.utils.impl.vo.VOUtilsImpl;

public class VOUtils {

    ///////////////////////////////////////////////
    // View Objects
    ///////////////////////////////////////////////
    
    // Print
    
    public static void printViewObjectInfo(String voName){
        printViewObjectInfo(getViewObjectByName(voName));
    }
    
    public static void printViewObjectInfo(ViewObject vo){
        VOUtilsImpl.printViewObjectInfo(vo);
    }
    
    // GET
        
    public static ViewObject getViewObjectByName(String ViewObjectName) {
        ApplicationModule am = ADFUtils.getApplicationModuleForDataControl(CONSTANTS_VO.AppModuleName);
        ViewObject vo = am.findViewObject(ViewObjectName); 
        return vo;
    }
    
    
    ///////////////////////////////////////////////
    // View Criterias
    ///////////////////////////////////////////////
    
    
    public static void printViewCriteriaNames(String voName){
            printViewCriteriaNames(getViewObjectByName(voName));
    }
    
    public static void printViewCriteriaNames(ViewObject vo) {
        VCUtilsImpl.printViewCriteriaNames(vo);
    }
    
    public static void printApplyViewCriteriaNames(String voName){
            printApplyViewCriteriaNames(getViewObjectByName(voName));
    }
    
    public static void printApplyViewCriteriaNames(ViewObject vo) {
        VCUtilsImpl.printApplyViewCriteriaNames(vo);
    }
    
    
//    // GET
//    
//    public static ViewCriteria getViewCriteriaByName(ViewObject vo, String vcName) {
//    }   
//    
//    // ADD
//    
//    public static void addViewCriteria(ViewObject vo, String vcName) {
//    }   
//    
//    
//    // Clear
//    
//    public static void clearViewCriteriaByName(String voName, String viewCriteriaForDeletion) {
//    }
//    
//    public static void clearViewCriteriaByName(ViewObject vo, String viewCriteriaForDeletion) {
//    }
//    
//
//    public static void clearViewCriteriaByNameAndExecuteViewObject(ViewObject vo, String viewCriteriaForDeletion) {
//    }
//    
//    public static void clearViewCriteriaByNameAndExecuteViewObject(String viewObjectName, String viewCriteriaForDeletion) {
//    }
//    
//    
//    public static void clearCutternViewCriterias(ViewObject vo) {
//    }
//    
//    public static void clearCutternViewCriteriasAndExecuteViewObject (ViewObject vo) {
//    }
//    
//    
//    ///////////////////////////////////////////////
//    // Where Clauses
//    ///////////////////////////////////////////////
//    
//    public static void printWhereClause (ViewObject vo) {
//    }
//    
//    
//    public static void applyWhereClauseToViewObjectAndExecuteViewObject (ViewObject vo, String WhereClause) {
//    }
//    
//    public static void clearWhereClauseToViewObject (ViewObject vo) {
//    }
//    
//    public static void clearWhereClauseToViewObjectAndExecuteViewObject (ViewObject vo) {
//    }
    

} // The End of Class;
