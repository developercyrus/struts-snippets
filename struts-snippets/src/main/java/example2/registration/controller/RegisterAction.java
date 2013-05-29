package example2.registration.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import example2.registration.model.RegisterForm;

public class RegisterAction extends Action {

    public ActionForward execute (ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
        RegisterForm rf = (RegisterForm) form;

        String password1 = rf.getPassword1();                             
        String password2 = rf.getPassword2();                             

        if (password1.equals(password2)) {
            return mapping.findForward("success");
        }    
        return mapping.findForward("failure");
    }

}
