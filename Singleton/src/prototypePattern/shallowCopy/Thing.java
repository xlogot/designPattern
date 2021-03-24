package prototypePattern.shallowCopy;

import java.util.ArrayList;

public class Thing implements Cloneable {
    static ArrayList<String> arrayList = new ArrayList<String>();
    @Override
    protected Thing clone() throws CloneNotSupportedException {
        Thing thing=null;
        try {
            thing = (Thing)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
    public void setValue(String value){
        arrayList.add(value);
    }
    //取得arrayList的值
    public ArrayList<String> getValue(){
        return arrayList;
    }
}
