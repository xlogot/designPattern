package FactoryMode.HumanFactory;

import FactoryMode.Human.Human;

public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human=null;
        try {
            human = c.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)human;
    }
}
