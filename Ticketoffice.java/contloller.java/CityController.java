package Ticketoffice.java.contloller.java;

public class CityController {
    private CityService cityService;

    public CityController(CityService cityService) {

        this.cityService = cityService;
    }

    public List<City> getAll() {
        return cityService.getAll();
    }

    public void create(String name) {
        cityService.create(name);
    }

    public void update(Long id, String name) {
        cityService.update(id, name);
    }

    public void delete(Long id) {
        cityService.delete(id);
    }

}

