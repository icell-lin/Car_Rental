package lab4.pract2;

public class RejectedState implements OrderState{
    @Override
    public void handleState() {
        System.out.println("Замовлення відхилено адміністратором");
    }
}
