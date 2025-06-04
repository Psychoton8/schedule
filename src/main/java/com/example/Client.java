package com.example;

public class Client {
    private String name;
    private String phone;
    private String email;
    private int amount;
    private int sessionsRemaining;


    public Client(String name, String phone, String email, int amount) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.amount = amount;
        this.sessionsRemaining = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return  phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getSessionsRemaining() {
        return sessionsRemaining;
    }

    public void decrementSession() {
        if(sessionsRemaining > 0) {
            sessionsRemaining--;
        }
    }
}
