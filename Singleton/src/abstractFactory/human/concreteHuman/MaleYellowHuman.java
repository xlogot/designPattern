package abstractFactory.human.concreteHuman;

import abstractFactory.human.AbstractYellowHuman;

public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄人男性");
    }
}
