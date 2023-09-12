package space.leti.ScheduleHelper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import space.leti.ScheduleHelper.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
