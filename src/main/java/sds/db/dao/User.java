package sds.db.dao;

import java.util.Date;

public class User {
     //  --- user.iduser
    private String iduser;

     //  --- user.username
    private String username;

     //  --- user.pwd
    private String pwd;

     //  --- user.status
    private Integer status;

     //  --- user.auth
    private String auth;

     //  --- user.usercol
    private String usercol;

     //  --- user.token
    private String token;

     //  --- user.md5_src
    private String md5Src;

     //注册时间  --- user.addtime
    private Date addtime;

     //更新日期  --- user.ts
    private Date ts;

     //  --- user.logintime
    private Date logintime;

     //  --- user.logourl
    private String logourl;

     //  --- user.nick
    private String nick;

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getUsercol() {
        return usercol;
    }

    public void setUsercol(String usercol) {
        this.usercol = usercol;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMd5Src() {
        return md5Src;
    }

    public void setMd5Src(String md5Src) {
        this.md5Src = md5Src;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public String getLogourl() {
        return logourl;
    }

    public void setLogourl(String logourl) {
        this.logourl = logourl;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}