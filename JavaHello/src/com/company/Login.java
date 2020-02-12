package com.company;

public class Login<T> {
    private T name;
    private T pass;

public Login(T name, T pass) {
        this.name = name;
        this.pass = pass;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getPass() {
        return pass;
    }

    public void setPass(T pass) {
        this.pass = pass;
    }
}
