package Ticketoffice.java.contloller.java.service.java;

public class CityService {
    private CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> getAll() {
        return cityRepository.getAll();
    }

    public void create(String name) {
        City city = getCity(name);
        cityRepository.add(city);
    }

    public void delete(Long id) {
        cityRepository.delete(id);
    }

    public void update(Long id, String name) {
        City city = getCity(name);
        city.setId(id);
        cityRepository.update(city);
    }

    private City getCity(String name) {
        City city = new City();
        city.setName(name);
        return city;
    }
}

