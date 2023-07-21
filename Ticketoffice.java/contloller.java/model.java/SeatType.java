package Ticketoffice.java.contloller.java.model.java;

public class SeatType {
    BUSINESS(1),
    ECONOMY(2);

    private int getId() {
        return id;
    }

    private int id; // Could be other data type besides int

    SeatType(int id) {
        this.id = id;
    }

    public static SeatType fromId(int id) {
        for (SeatType type : values()) {
            if (type.getId() == id) {
                return type;
            }
        }
        return null;
    }
}

