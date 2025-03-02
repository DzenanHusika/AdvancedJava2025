package three.patterns.decorator;

public class PatternDemo {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        System.out.println("Pije Faruk piće " + coffee.getName() + " i to ga košta " + coffee.cost());
        BosnianCoffee bosnianCoffee = new BosnianCoffee();
        System.out.println("Pije Tarik piće " + bosnianCoffee.getName() + " i to ga košta " + bosnianCoffee.cost());
        Beverage coffe1 = new MilkDecorator(new Coffee());
        System.out.println("Pije Jovan piće " + coffe1.getName() + " i to ga košta " + coffe1.cost());
        Tea tea = new Tea();
        System.out.println("Pije Marko piče " + tea.getName() + " i to ga košta " + tea.cost());
        Beverage tea1 = new MilkDecorator(new Tea());
        System.out.println("Pijee Dženita piće " + tea1.getName() + " i to je košta " + tea1.cost());
        Beverage irishCoffe = new WhiskeyDecorator(new Coffee());
        System.out.println("Pije Danko piće " + irishCoffe.getName() + " i to ga košta " + irishCoffe.cost());
    }
}
