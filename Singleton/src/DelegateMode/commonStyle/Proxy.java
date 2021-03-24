package DelegateMode.commonStyle;

public class Proxy extends Subject {
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    void method1() {
        //do something here
        subject.method1();
    }

    @Override
    void method2() {
        //do something here
        subject.method2();
    }
}
