package DecoratorPattern.commomPattern;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    void operate() {
        System.out.println("do something else by concrete decorator class");
        super.operate();
    }
}
