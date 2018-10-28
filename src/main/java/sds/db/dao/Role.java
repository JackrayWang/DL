package sds.db.dao;

import java.util.Date;

public class Role {
     //  --- role.idrole
    private String idrole;

     //  --- role.auth
    private String auth;

     //  --- role.rolename
    private String rolename;

     //  --- role.ts
    private Date ts;

     //  --- role.status
    private String status;

    public String getIdrole() {
        return idrole;
    }

    public void setIdrole(String idrole) {
        this.idrole = idrole;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}