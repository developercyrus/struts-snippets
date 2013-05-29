package example1.helloworld.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import example1.helloworld.model.HelloWorldForm;

public class HelloWorldAction extends Action {
    
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("user");

        HelloWorldForm hwForm = (HelloWorldForm) form;
        hwForm.setMessage("Hello World");
        
        if(username != null) {
            hwForm.setMessage("Hello World, " + username);
        }
        else {
            hwForm.setMessage("Hello World, nobody");
        }

        return mapping.findForward("helloUser");
    }
}
