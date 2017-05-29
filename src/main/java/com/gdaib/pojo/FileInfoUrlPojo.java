package com.gdaib.pojo;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by mahanzhen on 17-5-20.
 */
public class FileInfoUrlPojo {
    private String action;
    private int navigationId;



    public FileInfoUrlPojo(String action, int navigationId) {
        this.action = action;
        this.navigationId = navigationId;
    }

    public FileInfoUrlPojo(){}

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getNavigationId() {
        return navigationId;
    }

    public void setNavigationId(int navigationId) {
        this.navigationId = navigationId;
    }

    @Override
    public String toString() {
        return UrlPojo.getUrlPojo().toString() + action + "?navigationId=" + navigationId;
    }
}
