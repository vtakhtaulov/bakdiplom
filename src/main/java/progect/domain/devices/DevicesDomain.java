package progect.domain.devices;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import progect.domain.journal.NetworkJournalDomain;
import progect.domain.room.RoomDomain;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Table(schema = "network", name = "DevicesDomain")
public class DevicesDomain {

    @Id
    @GeneratedValue
    private Integer id_devices;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_type_devices")
    private TypeDeviceDomain id_type_devices;

    @ManyToOne(optional=false)
    @JoinColumn(name = "user_id")
    private UsersDomain user_otv;

    @Column(name = "hostname")
    private String hostname;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_room")
    private RoomDomain id_room;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_props_port")
    private PropsPortDomain id_props_port;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_network_journal")
    private List<NetworkJournalDomain> id_network_journal;


    public DevicesDomain(){}
}
