package com.springapp.mvc.beans;

/**
 * Created by Ультрамар on 22.06.2016.
 */
public class contactBean {

    private Integer id;

    private String firstname;

    private String lastname;

    private String email;

    private String telephone;

    private int salerID;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getSalerID() {
        return salerID;
    }
    public void setSalerID(int salerID) {
        this.salerID = salerID;
    }

}
