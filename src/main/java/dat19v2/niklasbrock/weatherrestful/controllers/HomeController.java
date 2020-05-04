package dat19v2.niklasbrock.weatherrestful.controllers;

import dat19v2.niklasbrock.weatherrestful.model.WeatherReport;
import dat19v2.niklasbrock.weatherrestful.services.ApiServiceImpl;
import dat19v2.niklasbrock.weatherrestful.services.WeatherReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.HttpClientErrorException;

@Controller
public class HomeController {
    @Autowired
    ApiServiceImpl apiService;
    @Autowired
    WeatherReportService weatherReportService;

    @GetMapping("/{city}")
    public String index(Model model, @PathVariable String city){
        try{
            WeatherReport currentReport = weatherReportService.convert(apiService.getArea(city));
            model.addAttribute("report", currentReport);
//            TODO Fix inserting the searched city into Hibernate
            weatherReportService.insert(currentReport);

        } catch (HttpClientErrorException e){
            model.addAttribute("citynotfound", "City not found, try again");
            model.addAttribute("report", null);
        }
        return "index";
    }

    @GetMapping("/history")
    public String history(Model model){
        model.addAttribute("weatherReports", weatherReportService.findAll());
        return "history";
    }
}
