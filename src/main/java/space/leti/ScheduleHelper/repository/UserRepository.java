package space.leti.ScheduleHelper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import space.leti.ScheduleHelper.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
