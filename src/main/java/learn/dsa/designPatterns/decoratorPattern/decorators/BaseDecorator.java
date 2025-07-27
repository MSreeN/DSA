package learn.dsa.designPatterns.decoratorPattern.decorators;

import learn.dsa.designPatterns.decoratorPattern.base.BasePizza;

public abstract class BaseDecorator implements BasePizza {
    public BasePizza basePizza;

    public abstract int getCost();
}
