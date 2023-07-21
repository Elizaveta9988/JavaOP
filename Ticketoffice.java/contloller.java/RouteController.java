package Ticketoffice.java.contloller.java;

public class RouteController {
    private RouteService routeService;

    public RouteController(RouteService routeService) {

        this.routeService = routeService;
    }

    public List<Route> getAll() {
        return routeService.getAll();
    }

    public void create(Long departureCityId, Date departureDate, Long arrivalCityId, Date arrivalDate) throws Exception {
        routeService.create(departureCityId, departureDate, arrivalCityId, arrivalDate);
    }

    public void update(Long id, Long departureCityId, Date departureDate, Long arrivalCityId, Date arrivalDate) throws Exception {

        routeService.update(id, departureCityId, departureDate, arrivalCityId, arrivalDate);
    }

    public void delete(Long id) {

        routeService.delete(id);
    }

}

