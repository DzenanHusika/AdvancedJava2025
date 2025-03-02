package three.patterns.decorator;

public class Coffee extends Beverage{
    public Coffee(){
        super("Espresso Coffe");
    }
    @Override
    public double cost() {
        return 2.0;
    }
}
