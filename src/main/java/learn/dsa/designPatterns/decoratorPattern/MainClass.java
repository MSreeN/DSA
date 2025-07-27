package learn.dsa.designPatterns.decoratorPattern;

import learn.dsa.designPatterns.decoratorPattern.base.BasePizzaBaked;
import learn.dsa.designPatterns.decoratorPattern.decorators.impl.CornDecorator;
import learn.dsa.designPatterns.decoratorPattern.decorators.impl.MushroomDecorator;

public class MainClass {
    public static void main(String[] args) {
        BasePizzaBaked bakedPizza = new BasePizzaBaked();
        CornDecorator cronTopping = new CornDecorator(bakedPizza);
        MushroomDecorator mushroomTopping = new MushroomDecorator(cronTopping);
        System.out.println(mushroomTopping.getCost());
    }
}
