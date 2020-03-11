package progect.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import progect.DTO.UserDTO;
import progect.domain.UsersDomain;

import java.util.List;
import java.util.Map;

public interface UserRepository extends JpaRepository<UsersDomain, Integer> {
}
