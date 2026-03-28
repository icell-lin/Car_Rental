package lab2;

import java.util.List;

public class Administrator {
    private int id;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private List<Car> carList;
    private List<RentalOrder> orderList;

    public Administrator() {
    }

    public Administrator(int id, String firstName, String lastName, String login, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
    }

    public Administrator(int id, String firstName, String lastName, String login, String password, List<Car> carList, List<RentalOrder> orderList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.carList = carList;
        this.orderList = orderList;
    }

    public int getId() {return id;}

    public String getFirstName() {return firstName;}

    public String getLogin() {return login;}

    public String getLastName() {return lastName;}

    public String getPassword() {return password;}

    public List<Car> getCarList() {return carList;}

    public List<RentalOrder> getOrderList() {return orderList;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public void setLogin(String login) {this.login = login;}

    public void setCarList(List<Car> carList) {this.carList = carList;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public void setId(int id) {this.id = id;}

    public void setPassword(String password) {this.password = password;}

    public void setOrderList(List<RentalOrder> orderList) {this.orderList = orderList;}

    @Override
    public String toString() {
        return "Administrator{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", carList=" + carList +
                ", orderList=" + orderList +
                '}';
    }
}
