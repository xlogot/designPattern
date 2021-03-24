package abstractFactory.human.concreteHuman;

import abstractFactory.human.AbstractBlackHuman;

public class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("Black人男性");
    }
}
