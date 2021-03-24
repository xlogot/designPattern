package DecoratorPattern.commomPattern;

public abstract class Decorator  extends  Component{
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    void operate() {
        component.operate();
    }
}
