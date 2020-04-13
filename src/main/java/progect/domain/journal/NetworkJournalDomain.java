package progect.domain.journal;

import lombok.Data;
import progect.domain.user.UsersDomain;
import progect.domain.devices.DevicesDomain;
import progect.domain.network.NetworkDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(schema = "network", name = "NetworkJournal")
public class NetworkJournalDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_network_journal;


    @ManyToOne(optional=false)
    @JoinColumn(name = "id_network")
    private NetworkDomain id_network;


    private String DNS_zone;

    @NotNull
    private Date date_reg;

    private Date date_old;

    @NotNull
    private String ip_address;


    @ManyToOne
    @JoinColumn(name = "id_user_reg",referencedColumnName = "user_id")
    private UsersDomain id_user_reg;

    @ManyToOne
    @JoinColumn(name = "id_user_old",referencedColumnName = "user_id")
    private UsersDomain id_user_old;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_devices")
    private DevicesDomain id_devices;

    @Column(name = "actual")
    @NotNull
    private Integer actual;


    public NetworkJournalDomain() {
    }

}
