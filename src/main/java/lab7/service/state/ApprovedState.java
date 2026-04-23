package lab7.service.state;

public class ApprovedState implements OrderState {
    @Override
    public void handleState() {
        System.out.println("Замовлення підтверджено. Клієнт може забрати автомобіль");
    }
}
