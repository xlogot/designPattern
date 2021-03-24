package singleton;

public class Singleton {
    //可以多线程使用，可以不加锁
    //这个实例有jvm创建，程序员无法掌控，可能会过早的创建，降低了内存的使用效率。
    private static Singleton singleton=new Singleton();
    private Singleton(){};
    public static Singleton getSingleton(){
        return singleton;
    }
    public static int doSomething(){
        //一些别的方法
        return 0;
    }
}


