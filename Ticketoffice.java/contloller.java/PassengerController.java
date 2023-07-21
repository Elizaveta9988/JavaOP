package Ticketoffice.java.contloller.java;

public class PassengerController {
    private PassengerService passengerService;

    public PassengerController(PassengerService passengerService) {

        this.passengerService = passengerService;
    }

    public List<Passenger> getAll(){
        return passengerService.getAll();
    }

    public void create(String firstName, String lastName, Date date) {

        passengerService.create(firstName, lastName, date);
    }

    public void update(Long id, String firstName, String lastName, Date date){
        passengerService.update(id, firstName, lastName, date);
    }

    public void delete(Long id){
        passengerService.delete(id);
    }

}

