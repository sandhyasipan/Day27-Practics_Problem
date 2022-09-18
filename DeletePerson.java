package com.bridgelabs;

public class DeletePerson {
    private String firstname;
    private String lastname;
    private String address;

    public DeletePerson(String firstname ,String lastname, String address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "DeletePerson{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
