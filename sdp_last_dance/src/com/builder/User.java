package com.builder;


public class User {
    private String name;
    private String surname;
    private String username;
    private String cvv;
    private int account;
    private int age;

    public User(String name , String surname , String username , String cvv , int account , int age) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.cvv = cvv;
        this.account = account;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
