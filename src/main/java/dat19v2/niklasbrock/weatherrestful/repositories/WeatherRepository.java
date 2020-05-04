package dat19v2.niklasbrock.weatherrestful.repositories;

import dat19v2.niklasbrock.weatherrestful.model.jsontopojo.Weather;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRepository extends CrudRepository<Weather, Long> {
}
