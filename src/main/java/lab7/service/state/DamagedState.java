package lab7.service.state;

public class DamagedState implements OrderState {
    @Override
    public void handleState() {
        System.out.println("Автомобіль пошкоджено. Виставлено рахунок за ремонт");
    }
}
