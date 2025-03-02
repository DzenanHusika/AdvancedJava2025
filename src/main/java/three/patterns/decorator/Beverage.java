package three.patterns.decorator;

public abstract class Beverage {
    public static int counter = 0;
    private String name;
    private String description = "Unknown Beverage";

    public Beverage(String name){
        this.name = name;
        counter++;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(){
        this.description = description;
    }
    public abstract double cost();
}
