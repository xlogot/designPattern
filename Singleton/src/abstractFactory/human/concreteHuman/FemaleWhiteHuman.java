package abstractFactory.human.concreteHuman;

import abstractFactory.human.AbstractWhiteHuman;

public class FemaleWhiteHuman extends AbstractWhiteHuman {

    @Override
    public void getSex() {
        System.out.println("white人女性");
    }
}
