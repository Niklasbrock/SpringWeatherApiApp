package dat19v2.niklasbrock.weatherrestful.services;

import dat19v2.niklasbrock.weatherrestful.model.jsontopojo.Area;

public interface ApiService {
    Area getArea(String city);
}
