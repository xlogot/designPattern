package ResponsableChain.refactorExample;

import ResponsableChain.example.IWomen;

public class Women implements IWomen {
    private int type=0;
    //妇女的请示
    private String request = "";
    //构造函数传递过来请求
    public Women(int _type,String _request){
        this.type = _type;
//为了便于显示， 在这里做了点处理
        switch(this.type){
            case 1:
                this.request = "女儿的请求是： " + _request;
                break;
            case 2:
                this.request = "妻子的请求是： " + _request;
                break;
            case 3:
                this.request = "母亲的请求是： " + _request;
        }
    }


    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
