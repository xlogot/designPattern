package FactoryMode.HumanFactory;

import FactoryMode.Human.Human;

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
