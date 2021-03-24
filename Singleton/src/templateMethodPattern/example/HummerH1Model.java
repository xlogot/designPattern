package templateMethodPattern.example;

public class HummerH1Model extends HummerModel {
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }
    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的...");
    }
    public void start() {
        System.out.println("悍马H1发动...");
    }
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
