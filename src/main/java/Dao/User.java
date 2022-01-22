package Dao;

import java.sql.Timestamp;
import java.util.Calendar;

public class User {

    public int user_id;
    public String userName;
    public String passWord;
    public String sex;
    public String address;
    public Timestamp birthday;

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }


    public User() {
    }

    public User(int user_id, String userName, String passWord, String sex, String address,Timestamp birthday) {
        this.user_id = user_id;
        this.userName = userName;
        this.passWord = passWord;
        this.sex = sex;
        this.address = address;
        this.birthday= birthday;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
