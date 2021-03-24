package DelegateMode.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {
    //被代理的实例
    Object obj = null;
    //我要代理谁
    public GamePlayIH(Object _obj){
        this.obj = _obj;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(obj, args);
        if (method.getName().equalsIgnoreCase("login")){
            System.out.println("有人在用的我的账号登录");
        }
        return result;
    }
}
