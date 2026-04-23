package lab7.service.state;

public class ReturnedState implements OrderState {
    @Override
    public void handleState() {
        System.out.println("Автомобіль повернуто. Автомобіль знову доступний для оренди");
    }
}
