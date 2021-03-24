package singleton;

public class Singleton1 {
    //这样应该就实现了按需创建的单例模式了，大概就是用一个方法，代替了变量。
    private Singleton1(){}
    public static Singleton1 getInstace() {
        return Nested.instance;
    }
    static class Nested{
        static Singleton1 instance=new Singleton1();
    }
}
