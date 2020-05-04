package dat19v2.niklasbrock.weatherrestful.repositories;

import dat19v2.niklasbrock.weatherrestful.model.jsontopojo.Wind;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WindRepository extends CrudRepository<Wind, Long> {
}
