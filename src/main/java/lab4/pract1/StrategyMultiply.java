package lab4.pract1;

public class StrategyMultiply implements Strategy{
    @Override
    public double execute(double a, double b) {
        return a*b;
    }
}