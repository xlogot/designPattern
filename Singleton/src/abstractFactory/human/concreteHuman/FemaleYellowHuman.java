package abstractFactory.human.concreteHuman;

import abstractFactory.human.AbstractYellowHuman;

public class FemaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄人女性");
    }
}
