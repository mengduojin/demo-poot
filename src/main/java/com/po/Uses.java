package com.po;

import java.io.Serializable;

public class Uses implements Serializable {
    private String sname;
    private String passwd;

    public Uses() {
    }

    public Uses(String sname, String passwd) {
        this.sname = sname;
        this.passwd = passwd;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "Uses{" +
                "sname='" + sname + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
