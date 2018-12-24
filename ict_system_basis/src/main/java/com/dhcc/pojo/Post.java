package com.dhcc.pojo;

public class Post {
    private Integer id;

    private String postnum;

    private String postname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPostnum() {
        return postnum;
    }

    public void setPostnum(String postnum) {
        this.postnum = postnum == null ? null : postnum.trim();
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname == null ? null : postname.trim();
    }
}