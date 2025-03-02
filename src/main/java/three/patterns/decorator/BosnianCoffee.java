package three.patterns.decorator;

public class BosnianCoffee extends Beverage{
    public BosnianCoffee(){
        super("Bosnian Coffe");
    }
    @Override
    public double cost() {
        return 2.5;
    }
}
