package dat19v2.niklasbrock.weatherrestful.repositories;

import dat19v2.niklasbrock.weatherrestful.model.WeatherReport;
import org.springframework.data.repository.CrudRepository;

public interface WeatherReportRepository extends CrudRepository<WeatherReport, Long> {
}
