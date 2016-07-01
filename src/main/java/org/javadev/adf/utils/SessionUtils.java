package org.javadev.adf.utils;

import java.util.Enumeration;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionUtils {
    
    
    // Print All Session Objects
    
    public static void printSessionObjects(){
        
        HttpSession session =  getSession();
        
        Enumeration sessionNames = session.getAttributeNames();
        String sessionName = null;
        Object sessionValue = null;

        while (sessionNames.hasMoreElements()) {
          sessionName = (String)sessionNames.nextElement();
          sessionValue = session.getAttribute(sessionName);
          System.out.println("\t Session name: " + sessionName +
                             ", value: " + sessionValue);
        }
    }
    
    
    // Write Attribute to session
    
    public static void setStringAttributeToSession(String attrName, String attrValue){
        SessionUtils.getSession().setAttribute(attrName, attrValue);
    }
    
    public static String getStringAttributeFromSession(String attrName){
        return (String)SessionUtils.getSession().getAttribute(attrName);
    }
    
    // Write Object to Session
    
    public static void writeObjectToSession(String objName, Object obj) {
        SessionUtils.getSession().setAttribute(objName, obj);     
    }
    
    public static Object getObjectFromSession(String objName) {       
        Object res = (Object) SessionUtils.getSession().getAttribute(objName);
        return res;
    }
    
    /////////////////////////////////////////////

    public static HttpSession getSession() {
            ExternalContext ectx = FacesContext.getCurrentInstance().getExternalContext();
            HttpServletRequest request = (HttpServletRequest)ectx.getRequest();
            return request.getSession();
    }
    
} // The End of Class;
