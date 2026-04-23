package lab7.service.state;

public class RejectedState implements OrderState {
    @Override
    public void handleState() {
        System.out.println("Замовлення відхилено адміністратором");
    }
}
