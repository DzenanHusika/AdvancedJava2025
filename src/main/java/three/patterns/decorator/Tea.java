package three.patterns.decorator;

public class Tea extends Beverage{
    public Tea() {
        super("Čaj");
    }

    @Override
    public double cost() {
        return 3.0;
    }
}
