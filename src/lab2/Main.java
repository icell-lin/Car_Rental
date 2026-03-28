package lab2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setId(1);
        car1.setBrand("Audi");
        car1.setModel("A6");
        car1.setAvilable(true);
        car1.setDescription("Audi A6 - спорти преміальний автомобіль бізнес-класу (E-segment), відомий своїм комфортом, передовими технологіями та високою якістю матеріалів");
        car1.setPricePerDay(20);
        car1.setYearGraduation(2022);

        System.out.println(car1.toString());

        Administrator administrator = new Administrator(11, "Олег", "Глей","RentalCar", "133101");

        System.out.println(administrator);

        Client client = new Client(13, "Андрій", "Мельник", "1953121", "0987654321", "qwert@gmail.com");

        System.out.println(client);

        RentalOrder rentalOrder = new RentalOrder();
        rentalOrder.setCar(car1);
        rentalOrder.setId(12);
        rentalOrder.setAdministrator(administrator);
        rentalOrder.setClient(client);
        rentalOrder.setEndDate("30.03.2026");
        rentalOrder.setPaymentStatus("Оплачено");
        rentalOrder.setStartDate("26.03.2026");

        System.out.println(rentalOrder);

        DamageReport damageReport = new DamageReport();
        damageReport.setId(12);
        damageReport.setDescription("Тріщина лобового скла");
        damageReport.setRentalOrder(rentalOrder);
        damageReport.setRepairCost(180);

        System.out.println(damageReport.toString());
    }
    }
