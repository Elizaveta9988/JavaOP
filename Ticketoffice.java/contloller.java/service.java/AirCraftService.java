package Ticketoffice.java.contloller.java.service.java;

public class AirCraftService {
    
    private AircraftRepository aircraftRepository;

    public AirCraftService(AircraftRepository aircraftRepository)
    {
        this.aircraftRepository = aircraftRepository;
    }

    public List<Aircraft> getAll() {
        return aircraftRepository.getAll();
    }

    public void create(String name, int busSeatAmount, int ecoSeatAmount) {
        Aircraft aircraft = getAircraft(name, busSeatAmount, ecoSeatAmount);
        aircraftRepository.add(aircraft);
    }

    public void delete(Long id) {
        aircraftRepository.delete(id);
    }

    public void update(Long id, String name, int busSeatAmount, int ecoSeatAmount) {
        Aircraft aircraft = getAircraft(name, busSeatAmount, ecoSeatAmount);
        aircraft.setId(id);
        aircraftRepository.update(aircraft);
    }

    private Aircraft getAircraft(String name, int busSeatAmount, int ecoSeatAmount) {
        Aircraft aircraft = new Aircraft();
        aircraft.setName(name);
        Map<SeatType, AircraftSeatAmount> seatNumberMap = new HashMap<>();
        seatNumberMap.put(SeatType.BUSINESS, new AircraftSeatAmount(busSeatAmount));
        seatNumberMap.put(SeatType.ECONOMY, new AircraftSeatAmount(ecoSeatAmount));
        aircraft.setSeatNumberMap(seatNumberMap);
        return aircraft;
    }
}

