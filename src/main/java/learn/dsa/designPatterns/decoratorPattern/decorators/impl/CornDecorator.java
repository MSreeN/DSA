package learn.dsa.designPatterns.decoratorPattern.decorators.impl;

import learn.dsa.designPatterns.decoratorPattern.base.BasePizza;
import learn.dsa.designPatterns.decoratorPattern.decorators.BaseDecorator;

public class CornDecorator extends BaseDecorator {

    public CornDecorator(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        System.out.println("Added cron topping");
//        System.out.println("cost " + (this.basePizza.getCost() + 10));
        return this.basePizza.getCost() + 10;
    }
}
