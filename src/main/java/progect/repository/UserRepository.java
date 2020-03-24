package progect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import progect.domain.user.UsersDomain;

public interface UserRepository extends JpaRepository<UsersDomain, Integer> {
}
