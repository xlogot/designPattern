package abstractFactory.factory;

import abstractFactory.human.Human;
import abstractFactory.human.concreteHuman.FemaleBlackHuman;
import abstractFactory.human.concreteHuman.FemaleWhiteHuman;
import abstractFactory.human.concreteHuman.FemaleYellowHuman;

public class FemaleFactory implements HumanFactory {

    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }
}
