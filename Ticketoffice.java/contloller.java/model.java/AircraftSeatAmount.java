package Ticketoffice.java.contloller.java.model.java;

public class AircraftSeatAmount extends BaseEntity {
    private int amount;

    /**
     * Constructors
     */

    public AircraftSeatAmount() {
    }


    public AircraftSeatAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Getters and Setters
     */

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}

