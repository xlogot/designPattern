package ResponsableChain.refactorExample;

import ResponsableChain.example.IWomen;

public class Son extends Handler {
    public Son(int _level) {
        super(_level);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是： 同意\n");
    }
}
