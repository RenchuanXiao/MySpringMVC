package Dao;

public class User {

    public int user_id;
    public String userName;
    public String passWord;
    public boolean sex;
    public String address;

    public User() {
    }

    public User(int user_id, String userName, String passWord, boolean sex, String address) {
        this.user_id = user_id;
        this.userName = userName;
        this.passWord = passWord;
        this.sex = sex;
        this.address = address;
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

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "user{" +
                "user_id=" + user_id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                '}';
    }
}
