package dat19v2.niklasbrock.weatherrestful.services;

import dat19v2.niklasbrock.weatherrestful.model.Area;
import dat19v2.niklasbrock.weatherrestful.repositories.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaService {
    @Autowired
    AreaRepository areaRepository;

    public void insert(Area area){
        areaRepository.save(area);
    }
    public Iterable<Area> findAll(){
        return areaRepository.findAll();
    }
}
