package dat19v2.niklasbrock.weatherrestful.repositories;

import dat19v2.niklasbrock.weatherrestful.model.jsontopojo.Sys;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRepository extends CrudRepository<Sys, Long> {
}
