package progect.repository.room;

import org.springframework.data.jpa.repository.JpaRepository;
import progect.domain.room.RoomDomain;

public interface RoomRepository extends JpaRepository<RoomDomain,Integer> {
}
