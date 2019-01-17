package top.by.xd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import top.by.xd.entity.City;

@Component
@Repository
public interface CityDao extends JpaRepository<City, Long> {
}
