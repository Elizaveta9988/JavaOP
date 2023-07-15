package Cars.java;

public class CarPart {
    protected String name;
    protected int condition;
    protected boolean broken;

    // Constructor
    public CarPart(String name, int condition) {
        this.name = name;
        this.condition = condition;
        this.broken = false;
    }

    public void setCondition(int wear) {
        this.condition -= wear;
        if (this.condition <= 0) {
            this.condition = 0; // Condition can't be negative
            this.broken = true;
            System.out.println(this.name + " is broken!");
        }
    }

    public String getName() {
        return this.name;
    }

    public int getCondition() {
        return this.condition;
    }

    public boolean isBroken() {
        return this.broken;
    }

    public void status() {
        System.out.println("Status report on " + this.name);
        System.out.println("Condition of " + this.name + ": " + this.condition);
        if (this.broken == false) {
            System.out.println(this.name + " is not broken");
        } else {
            System.out.println(this.name + " is broken");
        }
    }

    public void function(float milesDriven) {

    }
}

