package ObserverPattern.common;

public class ConcreteSubject extends Subject {
    public void doSomething(){
        //do something here
        super.notifyObserver();
    }
}
