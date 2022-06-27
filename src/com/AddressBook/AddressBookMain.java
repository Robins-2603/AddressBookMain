package com.AddressBook;

import java.util.Scanner;

// creating a contact class

class Contact{
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNo;
    private String emailId;

    // using getter setter to give and retrieve the value

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("------------Welcome to Address Book Program-------------------");
        // calling object
        Contact addContact = new Contact();
        // using scanner to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name:");
        addContact.setFirstName(sc.next());

        System.out.println("Enter Last Name:");
        addContact.setLastName(sc.next());

        System.out.println("Enter Address:");
        addContact.setAddress(sc.next());

        System.out.println("Enter City:");
        addContact.setCity(sc.next());

        System.out.println("Enter State:");
        addContact.setState(sc.next());

        System.out.println("Enter Zip Code:");
        addContact.setZip(sc.next());

        System.out.println("Enter Phone no:");
        addContact.setPhoneNo(sc.next());

        System.out.println("Enter Email id");
        addContact.setEmailId(sc.next());

        // printing the details of person

        System.out.println("First Name:- "+ addContact.getFirstName());
        System.out.println("Last Name:- "+ addContact.getLastName());
        System.out.println("Address:- "+ addContact.getAddress());
        System.out.println("City:- "+ addContact.getCity());
        System.out.println("State:- "+ addContact.getState());
        System.out.println("zip Code:- "+ addContact.getZip());
        System.out.println("Phone no:- "+ addContact.getPhoneNo());
        System.out.println("Email id:- "+ addContact.getEmailId());

    }
}
