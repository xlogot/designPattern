package strategyPattern.common;

public class ConcreteStrategy implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略1的运算法则");
    }
}
