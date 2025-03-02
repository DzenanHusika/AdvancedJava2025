package three.patterns.decorator;

public class WhiskeyDecorator extends Beverage{
    private Beverage beverage;

    public WhiskeyDecorator(Beverage beverage) {
        super(beverage.getName()+ " s Whiskey");
        this.beverage = beverage;
    }

    @Override
    public double cost() {

        return beverage.cost()+5.0;
    }
}
