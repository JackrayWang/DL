package sds.db.dao;

import java.util.Date;

public class Roleitem {
     //  --- roleitem.idroleitem
    private String idroleitem;

     //  --- roleitem.urlname
    private String urlname;

     //  --- roleitem.url
    private String url;

     //  --- roleitem.number
    private Integer number;

     //  --- roleitem.ts
    private Date ts;

    public String getIdroleitem() {
        return idroleitem;
    }

    public void setIdroleitem(String idroleitem) {
        this.idroleitem = idroleitem;
    }

    public String getUrlname() {
        return urlname;
    }

    public void setUrlname(String urlname) {
        this.urlname = urlname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }
}