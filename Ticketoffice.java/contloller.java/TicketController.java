package Ticketoffice.java.contloller.java;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public void buyTicket(Long flightId, Long passengerId, SeatType seatType, Double price) throws Exception {
        ticketService.buyTicket(flightId, passengerId, seatType, price);
    }

    public void returnTicket(Long ticketId) throws Exception {
        ticketService.returnTicket(ticketId);
    }

    public List<Ticket> findTicket(Date date, String from, String to, SeatType seatType,String firstName, String lastName) {
        return ticketService.findTicket(date, from, to, seatType, firstName, lastName);
    }

    public void update(Long id, Long flightId, Long passengerId, SeatType seatType, Double price) throws Exception {
        ticketService.update(id, flightId, passengerId, seatType, price);
    }

    public List<Ticket> getAll() {
        return ticketService.getAll();
    }
}

