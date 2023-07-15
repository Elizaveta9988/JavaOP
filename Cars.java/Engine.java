package Cars.java;

public class Engine  extends CarPart {
    private int oilLevel;

    public Engine() {
        super("Engine", 100);
        this.oilLevel = 100;
    }

    public int getOilLevel() {
        return this.oilLevel;
    }

}

