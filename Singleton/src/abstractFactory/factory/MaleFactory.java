package abstractFactory.factory;

import abstractFactory.human.Human;
import abstractFactory.human.concreteHuman.MaleBlackHuman;
import abstractFactory.human.concreteHuman.MaleWhiteHuman;
import abstractFactory.human.concreteHuman.MaleYellowHuman;

public class MaleFactory implements HumanFactory {
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }
}
