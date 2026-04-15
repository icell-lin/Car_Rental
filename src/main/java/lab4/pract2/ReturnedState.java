package lab4.pract2;

public class ReturnedState implements OrderState{
    @Override
    public void handleState() {
        System.out.println("Автомобіль повернуто. Автомобіль знову доступний для оренди");
    }
}
