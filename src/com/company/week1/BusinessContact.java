package com.company.week1;

/**
 * Created by 016308 on 3/5/2019.
 */
public class BusinessContact extends Person{
    private String phoneNumber;

    public BusinessContact(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BusinessContact(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "name='" + this.getName() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
