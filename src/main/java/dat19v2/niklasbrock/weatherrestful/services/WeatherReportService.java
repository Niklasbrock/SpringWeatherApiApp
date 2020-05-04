package dat19v2.niklasbrock.weatherrestful.services;

import dat19v2.niklasbrock.weatherrestful.model.jsontopojo.Area;
import dat19v2.niklasbrock.weatherrestful.model.WeatherReport;
import dat19v2.niklasbrock.weatherrestful.repositories.WeatherReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherReportService {
    @Autowired
    WeatherReportRepository weatherReportRepository;

    public WeatherReport convert(Area area){
        WeatherReport weatherReport = new WeatherReport();
//        Base
        weatherReport.setName(area.getName());
//        Main
        weatherReport.setTemp(area.getMain().getTemp());
        weatherReport.setTemp_min(area.getMain().getTemp_min());
        weatherReport.setHumidity(area.getMain().getHumidity());
        weatherReport.setPressure(area.getMain().getPressure());
        weatherReport.setFeels_like(area.getMain().getFeels_like());
        weatherReport.setTemp_max(area.getMain().getTemp_max());
//        Sys
        weatherReport.setCountry(area.getSys().getCountry());
        weatherReport.setSunrise(area.getSys().getSunrise());
        weatherReport.setSunset(area.getSys().getSunset());
//        Wind
        weatherReport.setDeg(area.getWind().getDeg());
        weatherReport.setSpeed(area.getWind().getSpeed());
        return weatherReport;
    }

    public void insert(WeatherReport weatherReport){
        weatherReportRepository.save(weatherReport);
    }

    public Iterable<WeatherReport> findAll(){
        return weatherReportRepository.findAll();
    }
}
