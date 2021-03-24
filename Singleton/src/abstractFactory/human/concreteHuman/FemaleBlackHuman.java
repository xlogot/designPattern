package abstractFactory.human.concreteHuman;

import abstractFactory.human.AbstractBlackHuman;

public class FemaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("black人女性");
    }
}
