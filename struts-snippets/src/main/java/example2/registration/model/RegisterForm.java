package example2.registration.model;

import org.apache.struts.action.ActionForm;

public class RegisterForm extends ActionForm {
    private static final long serialVersionUID = -6737853322761330702L;

    protected String username;
    protected String password1;
    protected String password2;

    public String getUsername() {
        return this.username;
    }

    public String getPassword1() {
        return this.password1;
    }

    public String getPassword2() {
        return this.password2;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword1(String password) {
        this.password1 = password;
    }

    public void setPassword2(String password) {
        this.password2 = password;
    }
}
