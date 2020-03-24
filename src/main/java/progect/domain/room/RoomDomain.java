package progect.domain.room;

import lombok.Data;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(schema = "network", name = "RoomDomain")
public class RoomDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_room;

    @Column(name = "name_room")
    @NotNull
    private String name_room;

    @Column(name = "usert_otv")
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsersDomain usert_otv;

    @Column(name = "type_room")
    @NotNull
    private String type_room;

    @Column(name = "id_nodes")
    @ManyToOne
    @JoinColumn(name = "id_nodes")
    private UsersDomain id_nodes;

    public RoomDomain(){}
}
