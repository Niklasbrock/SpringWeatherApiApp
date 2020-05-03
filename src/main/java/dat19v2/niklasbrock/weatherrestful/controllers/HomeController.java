package dat19v2.niklasbrock.weatherrestful.controllers;

import dat19v2.niklasbrock.weatherrestful.model.Area;
import dat19v2.niklasbrock.weatherrestful.services.ApiServiceImpl;
import dat19v2.niklasbrock.weatherrestful.services.AreaService;
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
    AreaService areaService;

    @GetMapping("/search/{city}")
    public String index(Model model, @PathVariable String city){
        try{
            Area currentCity = apiService.getArea(city);
            model.addAttribute("city", currentCity);
//            TODO Fix inserting the searched city into Hibernate
//            areaService.insert(currentCity);
        } catch (HttpClientErrorException e){
            model.addAttribute("citynotfound", "City not found, try again");
            model.addAttribute("city", null);
        }
        return "index";
    }

    @GetMapping("/history")
    public String history(Model model){
        model.addAttribute("cities", areaService.findAll());
        return "history";
    }
}
