package Computer;

import java.util.Arrays;
import java.util.Objects;

public class Computer {
    protected String manufacter;
    protected String model;
    protected double[] partPrices;

    public Computer(String manufacter, String model, double[] partPrices) {
        this.manufacter = manufacter;
        this.model = model;
        this.partPrices = partPrices;
    }

    public String getManufacter() {
        return manufacter;
    }

    public String getModel() {
        return model;
    }

    public double[] getPartPrices() {
        return partPrices;
    }

    public void setManufacter(String manufacter) {
        this.manufacter = manufacter;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPartPrices(double[] partPrices) {
        this.partPrices = partPrices;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacter='" + manufacter + '\'' +
                ", model='" + model + '\'' +
                ", partPrices=" + Arrays.toString(partPrices) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return Objects.equals(getManufacter(), computer.getManufacter()) && Objects.equals(getModel(), computer.getModel()) && Arrays.equals(getPartPrices(), computer.getPartPrices());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getManufacter(), getModel());
        result = 31 * result + Arrays.hashCode(getPartPrices());
        return result;
    }
}
