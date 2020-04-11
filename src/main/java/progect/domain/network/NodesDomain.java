package progect.domain.network;

import lombok.Data;
import progect.domain.devices.DevicesDomain;
import progect.domain.room.RoomDomain;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Table(schema = "network", name = "Nodes")
public class NodesDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_nodes;

    @ManyToOne(optional=false)
    @JoinColumn(name = "user_id")
    private UsersDomain usert_otv;

    @NotNull
    private String name_nodes;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_nodes")
    private List<RoomDomain> id_nodes_RoomDomain;

    public NodesDomain() {
    }
}
