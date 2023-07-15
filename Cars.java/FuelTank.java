package Cars.java;

public class FuelTank  extends CarPart{
    private double gas;

    public FuelTank() {
        super("Fuel Tank", 100);
        this.gas = 100;
    }

    public double getFuel() {
        return this.gas;
    }

    public void setGas(double miles) {
        this.gas -= miles * 0.075;
    }

}

