package lab4.pract2;

public class ApprovedState implements OrderState{
    @Override
    public void handleState() {
        System.out.println("Замовлення підтверджено. Клієнт може забрати автомобіль");
    }
}
