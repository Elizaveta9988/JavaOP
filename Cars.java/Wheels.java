package Cars.java;

public class Wheels extends CarPart{
    private double airPressure;
    private double tractionPercentage;

    public Wheels() {
        super("Wheels", 100);
        this.airPressure = 35.0;
        this.tractionPercentage = 100.0;
    }

    public double getAirPressure() {
        return this.airPressure;
    }

    public double getTraction() {
        return this.tractionPercentage;
    }

    public void setAirPressure(double miles) {
        this.airPressure -= miles * 0.015;
    }

    public void setTraction(double miles) {
        this.tractionPercentage -= miles * 0.015;
    }

}

