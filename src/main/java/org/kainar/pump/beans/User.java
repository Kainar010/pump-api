package org.kainar.pump.beans;

public class User {
    private int user_id;
    private String user_name;
    private String user_firstname;
    private String user_lastname;
    private String user_email;
    private int user_private_mode;
    private int user_status;

    public User(){
        
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_firstname(String user_firstname) {
        this.user_firstname = user_firstname;
    }

    public void setUser_lastname(String user_lastname) {
        this.user_lastname = user_lastname;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public void setUser_private_mode(int user_private_mode) {
        this.user_private_mode = user_private_mode;
    }

    public void setUser_status(int user_status) {
        this.user_status = user_status;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_firstname() {
        return user_firstname;
    }

    public String getUser_lastname() {
        return user_lastname;
    }

    public String getUser_email() {
        return user_email;
    }

    public int getUser_private_mode() {
        return user_private_mode;
    }

    public int getUser_status() {
        return user_status;
    }
}
