package templateMethodPattern.common;

public abstract class AbstractClass {
    abstract void  doAnything();
    abstract void doSomething();
    void templateMethod(){
        doAnything();
        doSomething();
    }
}
