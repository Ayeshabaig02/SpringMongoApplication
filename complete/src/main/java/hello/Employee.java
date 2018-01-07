package hello;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class Employee {
    @Id
    public String id;
    public String firstName;
    public String lastName;
    public String middleIntial;
    public String emailAddress;
    public String phoneNumber;
    public String positionCategory;
    public Date   dateHired;
    public String address1;
    public String address2;
    public String city;
    public String state;
    public String zipcode;
    public boolean active;

    public Employee(){}

    public Employee(String firstName, String lastName, String middleIntial, String emailAddress, String phoneNumber, String positionCategory, Date dateHired, String address1, String address2, String city, String state, String zipcode, boolean active) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleIntial = middleIntial;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.positionCategory = positionCategory;
        this.dateHired = dateHired;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.active = active;
    }
}
