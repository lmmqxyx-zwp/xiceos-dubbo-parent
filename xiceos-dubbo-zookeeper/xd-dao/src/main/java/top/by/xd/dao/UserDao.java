package top.by.xd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import top.by.xd.entity.User;

@Component
@Repository
public interface UserDao extends JpaRepository<User, Long> {
}
