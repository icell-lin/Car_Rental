package lab4.pract2;

public class PendingState implements OrderState{
    @Override
    public void handleState() {
        System.out.println("Замовлення очікує розгляду адміністратором");
    }
}
