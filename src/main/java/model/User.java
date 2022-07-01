package model;

import java.util.Date;


public class User {


    private Long user_id;
    private Long telegram_id;
    private String first_name;
    private String last_name;
    private Date last_modified_time = new Date();

    public User(){}

    public User(Long user_id) {
        this.user_id = user_id;
    }

    public User(Long user_id, String first_name, String last_name) {
        this.user_id = user_id;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public User(Long telegram_id, String first_name, String last_name, Date last_modified_time) {
        this.telegram_id = telegram_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.last_modified_time = last_modified_time;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getTelegram_id() {
        return telegram_id;
    }

    public void setTelegram_id(Long telegram_id) {
        this.telegram_id = telegram_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getLast_modified_time() {
        return last_modified_time;
    }

    public void setLast_modified_time(Date last_modified_time) {
        this.last_modified_time = last_modified_time;
    }

    @Override
    public String toString() {
        return user_id + " " + first_name + " " + last_name;
    }
}
