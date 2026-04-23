package lab7.service.state;

public class PendingState implements OrderState {
    @Override
    public void handleState() {
        System.out.println("Замовлення очікує розгляду адміністратором");
    }
}
