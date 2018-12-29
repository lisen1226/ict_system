package com.dhcc.pojo;

public class Personnel {
    private Integer id;

    private String uname;

    private String password;

    private String phone;

    private String unumber;

    private String urole;

    private String jurisdiction;

    private String post;

    private String electronicresume;

    private String registrationtime;

    private String personincharge;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getUnumber() {
        return unumber;
    }

    public void setUnumber(String unumber) {
        this.unumber = unumber == null ? null : unumber.trim();
    }

    public String getUrole() {
        return urole;
    }

    public void setUrole(String urole) {
        this.urole = urole == null ? null : urole.trim();
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction == null ? null : jurisdiction.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getElectronicresume() {
        return electronicresume;
    }

    public void setElectronicresume(String electronicresume) {
        this.electronicresume = electronicresume == null ? null : electronicresume.trim();
    }

    public String getRegistrationtime() {
        return registrationtime;
    }

    public void setRegistrationtime(String registrationtime) {
        this.registrationtime = registrationtime == null ? null : registrationtime.trim();
    }

    public String getPersonincharge() {
        return personincharge;
    }

    public void setPersonincharge(String personincharge) {
        this.personincharge = personincharge == null ? null : personincharge.trim();
    }
}