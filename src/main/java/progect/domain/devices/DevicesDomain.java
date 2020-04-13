package progect.domain.devices;


import lombok.Data;
import progect.domain.journal.NetworkJournalDomain;
import progect.domain.room.RoomDomain;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Table(schema = "network", name = "Devices")
public class DevicesDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_devices;

    @ManyToOne
    @JoinColumn(name = "id_type_devices")
    private TypeDeviceDomain id_type_devices;

    @ManyToOne
    @JoinColumn(name = "user_otv",referencedColumnName = "user_id")
    private UsersDomain user_otv;

    @NotNull
    private String hostname;

    @ManyToOne
    @JoinColumn(name = "id_room")
    private RoomDomain id_room;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_props_port")
    private PropsPortDomain id_props_port;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_network_journal")
    private List<NetworkJournalDomain> id_network_journal;


    public DevicesDomain(){}
}
