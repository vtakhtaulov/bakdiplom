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
@Table(schema = "network", name = "Room")
public class RoomDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_room;

    @NotNull
    private String name_room;

    @ManyToOne
    @JoinColumn(name = "usert_otv",referencedColumnName = "user_id")
    private UsersDomain user_otv;

    @NotNull
    private String type_room;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_nodes")
    private NodesDomain id_nodes;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_room")
    private List<DevicesDomain> id_devices;


    public RoomDomain(){}
}
