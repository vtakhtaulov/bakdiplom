package progect.domain.devices;


import lombok.Data;
import progect.domain.room.RoomDomain;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(schema = "network", name = "DevicesDomain")
public class DevicesDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_devices;

    @Column(name = "id_type_devices")
    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_type_devices")
    private TypeDeviceDomain id_type_devices;

    @Column(name = "id_room")
    @NotNull
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsersDomain user_otv;

    @Column(name = "hostname")
    private String hostname;

    @Column(name = "id_room")
    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_room")
    private RoomDomain id_room;

    @Column(name = "id_props_port")
    @NotNull
    @OneToOne
    @JoinColumn(name = "id_props_port")
    private RoomDomain id_props_port;

    public DevicesDomain(){}
}
