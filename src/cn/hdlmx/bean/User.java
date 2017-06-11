package cn.hdlmx.bean;

import cn.hdlmx.emun.Gender;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {
    private String firseName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private String phoneNumber;
    private Gender gender;
    private LocalDate birthday;//生日，使用Java8 时间API
    private String imagePath;
    private LocalDateTime signUpTime;//用户注册时间

    public User() {
    }

    public User(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public String getFirseName() {
        return firseName;
    }

    public void setFirseName(String firseName) {
        this.firseName = firseName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public LocalDateTime getSignUpTime() {
        return signUpTime;
    }

    public void setSignUpTime(LocalDateTime signUpTime) {
        this.signUpTime = signUpTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "firseName='" + firseName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", imagePath='" + imagePath + '\'' +
                ", signUpTime=" + signUpTime +
                '}';
    }
}
