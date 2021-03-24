package abstractFactory.human.concreteHuman;

import abstractFactory.human.AbstractWhiteHuman;

public class MaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("White人男性");
    }
}
