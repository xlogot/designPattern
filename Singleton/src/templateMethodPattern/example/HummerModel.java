package templateMethodPattern.example;

public abstract class HummerModel {
    abstract void start();
    abstract void stop();
    abstract void alarm();
    abstract void engineBoom();
    public void run(){
        start();
        stop();
        if (isAlarm()){
            alarm();
        }
        engineBoom();
    }
    protected  boolean isAlarm(){
        return true;
    }
}
