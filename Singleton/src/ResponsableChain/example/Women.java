package ResponsableChain.example;

public class Women implements IWomen {
    //代表,2已婚还是丈夫健在,1未婚,3已婚丈夫趋势
    private int type;
    private String request;

    public Women(int type, String request) {
        this.type = type;
        this.request = request;
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
