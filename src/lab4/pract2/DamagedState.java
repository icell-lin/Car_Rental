package lab4.pract2;

public class DamagedState implements OrderState{
    @Override
    public void handleState() {
        System.out.println("Автомобіль пошкоджено. Виставлено рахунок за ремонт");
    }
}
