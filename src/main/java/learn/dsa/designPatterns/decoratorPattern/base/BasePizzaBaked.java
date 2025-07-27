package learn.dsa.designPatterns.decoratorPattern.base;

public class BasePizzaBaked implements BasePizza {
    public String description = "Basic baked pizza";
    public int cost = 10;

    public int getCost(){
        System.out.println("Selected base pizza");
        return this.cost;
    }
}
