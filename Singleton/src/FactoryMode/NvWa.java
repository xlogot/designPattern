package FactoryMode;

import FactoryMode.Human.BlackHuman;
import FactoryMode.Human.Human;
import FactoryMode.Human.WhiteHuman;
import FactoryMode.Human.YellowHuman;
import FactoryMode.HumanFactory.AbstractHumanFactory;
import FactoryMode.HumanFactory.HumanFactory;


public class NvWa {
    private static AbstractHumanFactory yinYangLu=null;
    private static void setHumanFactory(AbstractHumanFactory input){
        yinYangLu=input;
    }
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("FactoryMode.HumanFactory.HumanFactory");
            Object o = aClass.getDeclaredConstructor().newInstance();
            setHumanFactory((AbstractHumanFactory) o);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("==造出的第一批是白色人种==");
        Human whiteHuman=yinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("==造出的第一批是黑色人种==");
        Human blackHuman=yinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        System.out.println("==造出的第一批是黄色人种==");
        Human yellowHuman=yinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();


    }
}
