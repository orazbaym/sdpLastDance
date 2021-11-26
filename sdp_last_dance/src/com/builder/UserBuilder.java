package com.builder;

public class UserBuilder {
    private String name;
    private String surname;
    private String username;
    private String cvv;
    private int account;
    private int age;

    public User build() {
        return new User ( name , surname , username , cvv , account , age );
    }

    public UserBuilder withAccount(int account) {
        this.account = account;

        return this;
    }

    public UserBuilder withAge(int age) {
        this.age = age;

        return this;
    }

    public UserBuilder withName(String name) {
        this.name = name;

        return this;
    }

    public UserBuilder withSurname(String surname) {
        this.surname = surname;

        return this;
    }

    public UserBuilder withCvv(String cvv) {
        this.cvv = cvv;

        return this;
    }

    public UserBuilder withUsername(String username) {
        this.username = username;

        return this;
    }

}
