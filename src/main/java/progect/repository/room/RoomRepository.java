package progect.repository.room;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import progect.domain.room.RoomDomain;

public interface RoomRepository extends JpaRepository<RoomDomain,Integer> {

    @Query(value = "delete from network.room where cast (id_room as varchar) = cast(?1 as varchar)",
        nativeQuery = true)
    boolean delete(Integer id_room);
}
