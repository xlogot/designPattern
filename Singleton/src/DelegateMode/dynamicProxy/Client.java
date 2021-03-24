package DelegateMode.dynamicProxy;

import DelegateMode.GamePlayer;
import DelegateMode.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) throws Throwable {

        IGamePlayer player = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayIH(player);


        System.out.println("开始时间是： 2009-8-25 10:45");
        ClassLoader cl = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, GamePlayer.class.getInterfaces(),handler);

        proxy.login("zhangSan", "password");//开始杀怪
        proxy.killBoss();
        proxy.upgrade();

        System.out.println("结束时间是： 2009-8-26 03:40");
    }
}
