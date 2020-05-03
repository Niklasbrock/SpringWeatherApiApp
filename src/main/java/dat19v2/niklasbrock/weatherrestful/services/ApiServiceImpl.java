package dat19v2.niklasbrock.weatherrestful.services;

import dat19v2.niklasbrock.weatherrestful.model.Area;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Area getArea(String city) {
        Area area = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q="+city+"&units=metric&appid=d764f9390ad1c2b63fff48d46280d3b6", Area.class);
        return area;
    }
}
