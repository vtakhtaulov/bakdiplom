package progect.domain.room;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import progect.domain.devices.DevicesDomain;
import progect.domain.network.NodesDomain;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Table(schema = "network", name = "RoomDomain")
public class RoomDomain {

    @Id
    @GeneratedValue
    private Integer id_room;

    @Column(name = "name_room")
    @NotNull
    private String name_room;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UsersDomain user_otv;

    @Column(name = "type_room")
    @NotNull
    private String type_room;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_nodes")
    private NodesDomain id_nodes;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_room")
    private List<DevicesDomain> id_devices;


    public RoomDomain(){}
}
