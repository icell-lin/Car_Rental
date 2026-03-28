package lab2;

import java.util.List;

public class Client {
    private int id;
    private String firstName;
    private String lastName;
    private String passportNumber;
    private String phone;
    private String email;
    private List<RentalOrder> orderList;

    public Client() {
    }

    public Client(int id, String lastName, String firstName, String passportNumber, String phone, String email) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.passportNumber = passportNumber;
        this.phone = phone;
        this.email = email;
    }

    public Client(int id, String firstName, String lastName, String passportNumber, String phone, String email, List<RentalOrder> orderList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        this.phone = phone;
        this.email = email;
        this.orderList = orderList;
    }

    public void setId(int id) {this.id = id;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public void setPassportNumber(String passportNumber) {this.passportNumber = passportNumber;}

    public void setPhone(String phone) {this.phone = phone;}

    public void setEmail(String email) {this.email = email;}

    public void setOrderList(List<RentalOrder> orderList) {this.orderList = orderList;}

    public int getId() {return id;}

    public String getFirstName() {return firstName;}

    public String getPassportNumber() {return passportNumber;}

    public String getLastName() {return lastName;}

    public String getEmail() {return email;}

    public String getPhone() {return phone;}

    public List<RentalOrder> getOrderList() {return orderList;}

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", orderList=" + orderList +
                '}';
    }
}
