package org.javadev.adf.utils;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import org.apache.myfaces.trinidad.event.DisclosureEvent;

import org.javadev.adf.utils.impl.ui.UIUtilsPrintImpl;
import org.javadev.adf.utils.impl.ui.UIUtilsShowMessageImpl;
import org.javadev.adf.utils.impl.ui.UIUtilsUpdateImpl;


public class UIUtils {


    // --------------------------------------------------------------
    // PRINT UIComponent INFO
    // --------------------------------------------------------------

    public static void printUIComponentInfo(ValueChangeEvent valueChangeEvent) {
        UIComponent uic = valueChangeEvent.getComponent();
        UIUtilsPrintImpl.printUIComponentInfo(uic);
    }
    
    public static void printUIComponentInfo(ActionEvent actionEvent) {
        UIComponent uic =  actionEvent.getComponent();
        UIUtilsPrintImpl.printUIComponentInfo(uic);
    }
    
    public static void printUIComponentInfo(DisclosureEvent disclosureEvent) {
        UIComponent uic =  disclosureEvent.getComponent();
        UIUtilsPrintImpl.printUIComponentInfo(uic);
    }

    public static void printUIComponentInfo(String uicID) {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@ Stirng UIC ID " + uicID);
        UIUtilsPrintImpl.printUIComponentInfo(UIUtils.getUIComponentByAbsoluteID(uicID));
    }
    
    public static void printUIComponentInfo(UIComponent uic) {
        UIUtilsPrintImpl.printUIComponentInfo(uic);
    }

    // --------------------------------------------------------------
    // UPDATE UIComponent
    // --------------------------------------------------------------
    
    public static void updateUIComponentByAbsoluteID(String uuid){
        UIUtilsUpdateImpl.updateUIByUUID(uuid);
    }
    
    public static void updateUIComponent(UIComponent uic){
        UIUtilsUpdateImpl.updateUIByUUID(uic);
    }
    
    // --------------------------------------------------------------
    // GET UIComponent
    // --------------------------------------------------------------
    
    public static UIComponent getUIComponent(ValueChangeEvent valueChangeEvent) {
        UIComponent uic = valueChangeEvent.getComponent();
        return uic;
    }
    
    public static UIComponent getUIComponent(ActionEvent actionEvent) {
        UIComponent uic = actionEvent.getComponent();
        return uic;
    }
    
    public static UIComponent getUIComponent(DisclosureEvent disclosureEvent) {
        UIComponent uic =  disclosureEvent.getComponent();
        return uic;
    }

    public static UIComponent getUIComponentByAbsoluteID(String uiID){
        FacesContext fctx =  FacesContext.getCurrentInstance();
        UIComponent ui = fctx.getViewRoot().findComponent(uiID);
        
        if (ui == null) {
            new RuntimeException();
        } 
        return ui;
    }
    
    // 
    
    public static String getUIComponentAbsoluteID(ActionEvent actionEvent) {
        UIComponent uic = actionEvent.getComponent();
        return getUIComponentAbsoluteID(uic);
    }
    
    public static String getUIComponentAbsoluteID(UIComponent uic){
        String uicID = UIUtilsPrintImpl.getUIComponentAbsoluteID(uic.getClientId());
        return uicID;
    }
    
    
    ///////////////////////////////////////////////
    // Show Message on Screen
    ///////////////////////////////////////////////
    
    
    public static void showMessageOnScreen(String message){
        UIUtilsShowMessageImpl.onScreen(message);
    }
    
    
    //Show message of type - FATAL, ERROR, WARN, INFO
    public static void showMessageOnScreen(String msgType, String msg){
        UIUtilsShowMessageImpl.onScreen(msgType, msg);
    }



} // The End of Class;
