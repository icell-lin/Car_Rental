package lab2;

import lab4.pract2.OrderState;

public class RentalOrder {
    private int id;
    private String startDate;
    private String endDate;
    private String status;
    private String paymentStatus;
    private String rejectionReason;
    private Client client;
    private Car car;
    private Administrator administrator;
    private DamageReport damageReport;
    private OrderState state;

    public RentalOrder() {

    }

    public void setState(OrderState state) {
        this.state = state;
        state.handleState();
    }

    public RentalOrder(int id, String startDate, String endDate, String status, String paymentStatus) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.paymentStatus = paymentStatus;

    }

    public RentalOrder(int id, String startDate, String endDate, String status, String paymentStatus, String rejectionReason) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.paymentStatus = paymentStatus;
        this.rejectionReason = rejectionReason;
    }

    public RentalOrder(int id, String startDate, String endDate, String status, String paymentStatus, String rejectionReason, Client client, Car car, Administrator administrator) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.paymentStatus = paymentStatus;
        this.rejectionReason = rejectionReason;
        this.client = client;
        this.car = car;
        this.administrator = administrator;
    }

    public RentalOrder(int id, String startDate, String endDate, String status, String paymentStatus, String rejectionReason, Client client, Car car, Administrator administrator, DamageReport damageReport) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.paymentStatus = paymentStatus;
        this.rejectionReason = rejectionReason;
        this.client = client;
        this.car = car;
        this.administrator = administrator;
        this.damageReport = damageReport;
    }

    public void setId(int id) {this.id = id;}

    public void setStartDate(String startDate) {this.startDate = startDate;}

    public void setEndDate(String endDate) {this.endDate = endDate;}

    public void setStatus(String status) {this.status = status;}

    public void setPaymentStatus(String paymentStatus) {this.paymentStatus = paymentStatus;}

    public void setRejectionReason(String rejectionReason) {this.rejectionReason = rejectionReason;}

    public void setClient(Client client) {this.client = client;}

    public void setCar(Car car) {this.car = car;}

    public void setAdministrator(Administrator administrator) {this.administrator = administrator;}

    public void setDamageReport(DamageReport damageReport) {this.damageReport = damageReport;}

    public int getId() {return id;}

    public String getStartDate() {return startDate;}

    public String getEndDate() {return endDate;}

    public String getStatus() {return status;}

    public String getPaymentStatus() {return paymentStatus;}

    public String getRejectionReason() {return rejectionReason;}

    public Client getClient() {return client;}

    public Car getCar() {return car;}

    public Administrator getAdministrator() {return administrator;}

    public DamageReport getDamageReport() {return damageReport;}

    @Override
    public String toString() {
        return "RentalOrder{" +
                "id=" + id +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", status='" + status + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", rejectionReason='" + rejectionReason + '\'' +
                ", client=" + client +
                ", car=" + car +
                ", administrator=" + administrator +
                ", damageReport=" + damageReport +
                '}';
    }
}
