package lab3.pract2;

import lab5.Car;
import lab5.Client;
import lab5.DamageReport;
import lab5.RentalOrder;

public class RentalFacade {

    // створення автомобіля
    public Car addCar(String brand, String model, int yearGraduation, int id, double pricePerDay) {
        Car car = new Car();
        car.setBrand(brand);
        car.setModel(model);
        car.setYearGraduation(yearGraduation);
        car.setId((long) id); // Виправлено: setId замість setID та додано cast
        car.setPricePerDay(pricePerDay);
        car.setAvailable(true); // Тепер запрацює, коли увімкнеш Annotation Processing
        return car;
    }

    // створення клієнту
    public Client registerClient(long id, String lastName, String firstName, String passportNumber, String phone, String email){
        Client client = new Client();
        client.setId(id);
        client.setLastName(lastName);
        client.setFirstName(firstName);
        client.setPassportNumber(passportNumber);
        client.setPhone(phone);
        client.setEmail(email);
        return client;
    }

    // створення замовлення оренди
    public RentalOrder createOrder(long id, Client client, Car car, String start, String end) {
        RentalOrder order = new RentalOrder();
        order.setId(id);
        order.setClient(client);
        order.setCar(car);
        order.setStartDate(start);
        order.setEndDate(end);
        order.setStatus("в очікувані");
        car.setAvailable(false);
        return order;
    }

    // підтвердити замовлення
    public void approveOrder(RentalOrder order) {
        order.setStatus("підтверджено");
        order.setPaymentStatus("оплачено");
    }

    // замовлення із зазначенням причини
    public void rejectOrder(RentalOrder order, String reason) {
        order.setStatus("відхилено");
        order.setRejectionReason(reason);
        order.getCar().setAvailable(true); // машина знову доступна
    }

    // повернення автомобіля
    public void returnCar(RentalOrder order) {
        order.setStatus("returned");
        order.getCar().setAvailable(true); // машина знову доступна
    }

    // акт пошкодження
    public DamageReport addDamageReport(long id, RentalOrder order, String description, double cost) {
        DamageReport report = new DamageReport();
        report.setId(id);
        report.setDescription(description);
        report.setRepairCost(cost);
        order.setDamageReport(report);
        return report;
    }
}



