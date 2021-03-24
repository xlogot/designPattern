package builderPattern.example.builder;

import builderPattern.example.BenzModel;
import builderPattern.example.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();
    public CarModel getCarModel() {
        return this.benz;
    }
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }
}
