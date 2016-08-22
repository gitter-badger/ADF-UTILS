package org.javadev.adf.utils;

import java.util.Enumeration;
import java.util.Map;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.context.AdfFacesContext;
import java.util.Set;
import javax.faces.context.FacesContext;

public class ScopesUtils {
    
    ///////////////////////////////////////////////
    // SessionScope
    ///////////////////////////////////////////////    
    
    // Print All Session Objects
    
    public static void printSessionScope(){
        
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
    
    // ------------------------------------------------------------------
    
    public static HttpSession getSession() {
            ExternalContext ectx = FacesContext.getCurrentInstance().getExternalContext();
            HttpServletRequest request = (HttpServletRequest)ectx.getRequest();
            return request.getSession();
    }
    
    // ------------------------------------------------------------------
    
    // Write Attribute to session
    
    public static void setStringAttributeToSession(String attrName, String attrValue){
        getSession().setAttribute(attrName, attrValue);
    }
    
    public static String getStringAttributeFromSession(String attrName){
        return (String)getSession().getAttribute(attrName);
    }
    
    // Write Object to Session
    
    public static void writeObjectToSession(String objName, Object obj) {
        getSession().setAttribute(objName, obj);     
    }
    
    public static Object getObjectFromSession(String objName) {       
        Object res = (Object) getSession().getAttribute(objName);
        return res;
    }
    
    /////////////////////////////////////////////
    
    
    ///////////////////////////////////////////////
    // PageFlowScope
    ///////////////////////////////////////////////
    
    public static void dumpPageFlowScope() {
      AdfFacesContext facesCtx= null;
      facesCtx= AdfFacesContext.getCurrentInstance();
      Map<String, Object> scopeVar= facesCtx.getPageFlowScope();
      for ( String key  : scopeVar.keySet() ) {
        System.out.println("key: " + key);
        System.out.println("value: " + scopeVar.get(key));
      }
    }
    
    
    public static void printPageFlowScope(){
        
        AdfFacesContext adfFacesContext = null;
        adfFacesContext = AdfFacesContext.getCurrentInstance();
        Map _pageFlowScope = adfFacesContext.getPageFlowScope();
        
        Set<Map.Entry<String, Object>> entrySet = _pageFlowScope.entrySet();
        
        for (Map.Entry<String, Object> entry : entrySet) {
            String key = entry.getKey();
            Object value = entry.getValue();
            
            System.out.println("[key] " + key );
            System.out.println("[value] " + value.toString());
        }
    }
    
    public static void setVarToPageFlowScope(String varNameInPageFlowScope, String newValue){
        ADFContext.getCurrent().getPageFlowScope().put(varNameInPageFlowScope, newValue);
    }
    
    public static Object getObjectFromPageFlowScope(String varNameInPageFlowScope){
        return (Object)ADFContext.getCurrent().getPageFlowScope().get(varNameInPageFlowScope);
    }
    
    ///////////////////////////////////////////////
    // SessionScope
    ///////////////////////////////////////////////
    
    public static void setVarToSessionScope(String varNameInPageFlowScope, String newValue){
        ADFContext.getCurrent().getSessionScope().put(varNameInPageFlowScope, newValue);
    }
    
    public static void setObjectToSessionScope(Object varNameInPageFlowScope, String newValue){
        ADFContext.getCurrent().getSessionScope().put(varNameInPageFlowScope, newValue);
    }
    
    //    private FacesContext _facesCtx = FacesContext.getCurrentInstance();
    //    private ADFContext _adfCtx = ADFContext.getCurrent();
    //    private AdfFacesContext _adfFacesCtx = AdfFacesContext.getCurrentInstance();
    //    private ExternalContext _extCtx = _facesCtx.getExternalContext();
    
    //
    //    // #{applicationScope}
    //
    //    FacesContext fctx = FacesContext.getCurrentInstance();
    //    fctx.getExternalContext().getApplicationMap();
    //    or
    //    ADFContext adfCtx = ADFContext.getCurrent();
    //    adfCtx.getApplicationScope();
    //
    //
    //    // #{sessionScope}
    //
    //    FacesContext fctx = null;
    //    fctx = FacesContext.getCurrentInstance();
    //    fctx.getExternalContext().getSessionMap();
    //    or
    //    ADFContext adfCtx = ADFContext.getCurrent();
    //    adfCtx.getSessionScope();
    //
    //
    //    // #{requestScope}
    //
    //    FacesContext fctx = null;
    //    fctx = FacesContext.getCurrentInstance();
    //    fctx.getExternalContext().getRequestMap();
    //    or
    //    ADFContext adfCtx = ADFContext.getCurrent();
    //    adfCtx.getRequestScope();
    //
    //
    //    // #{pageFlowScope}
    //
    //    AdfFacesContext adfFacesContext = null;
    //    adfFacesContext = AdfFacesContext.getCurrentInstance();
    //    Map _pageFlowScope = adfFacesContext.getPageFlowScope();
    //
    //
    //    // #{viewScope}
    //
    //    AdfFacesContext adfFacesContext = null;
    //    adfFacesContext = AdfFacesContext.getCurrentInstance();
    //    Map _viewScope = adfctx.getViewScope();
    //    or
    //    ADFContext adfCtx = ADFContext.getCurrent();
    //    adfCtx.getViewScope()
    //
    //
    //    // #{backingBeanScope}
    //
    //    AdfFacesContext adfFacesContext = null;
    //    adfFacesContext = AdfFacesContext.getCurrentInstance();
    //    BackingBeanScopeProviderImpl provider =
    //    adfFacesContext. getBackingBeanScopeProvider();
    //    Map backingBeanScope = null;
    //    backingBeanScope = provider.getCurrentScope();
    
    
    
    
    //     //Web App context root
    //    public String getWebAppContextRoot(){
    //        return _extCtx.getRequestContextPath();
    //    }//getWebAppContextRoot
    //
    //    //Get Application Scope
    //    public Map<String, Object> getApplicationScope(){
    //        return _adfCtx.getApplicationScope();
    //    }//getApplicationScope
    //
    //    //Get Session Scope
    //    public Map<String, Object> getSessionScope(){
    //        return _adfCtx.getSessionScope();
    //    }//getSessionScope
    //
    //    //Get PageFlowScope
    //    public Map<String,Object> getPageFlowScope(){
    //        return _adfFacesCtx.getPageFlowScope();
    //    }//getPageFlowScope
    //
    //    //Get Alternative PageFlowScope
    //    public Map<String,Object> getPageFlowScope2(){
    //        return _adfCtx.getPageFlowScope();
    //    }//getPageFlowScope2
    //
    //    //Get ViewScope
    //    public Map<String,Object> getViewScope(){
    //        return _adfFacesCtx.getViewScope();
    //    }//getViewScope
    //
    //    //Get Request Scope
    //    public Map<String, String> getRequestScope(){
    //        return _adfCtx.getRequestScope();
    //    }//getRequestScope
    
} // The End of Class;
