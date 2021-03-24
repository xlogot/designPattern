package abstractFactory.factory;

import abstractFactory.human.Human;

public interface HumanFactory {
    Human createYellowHuman();
    Human createWhiteHuman();
    Human createBlackHuman();
}
