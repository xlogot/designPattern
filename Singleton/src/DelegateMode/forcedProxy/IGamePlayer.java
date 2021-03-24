package DelegateMode.forcedProxy;


//增加了一个getProxy方法， 指定要访问自己必须通过哪个代理， 实现类也要做适当的修改
public interface IGamePlayer {
    void login(String user, String password);
    void killBoss();
    void upgrade();
    IGamePlayer getProxy();
}
