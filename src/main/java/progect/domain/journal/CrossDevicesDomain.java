package progect.domain.journal;

import lombok.Data;
import progect.domain.devices.DevicesDomain;
import progect.domain.network.CrossesDomain;
import progect.domain.network.VlanDomain;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@Table(schema = "network", name = "CrossDevices")
public class CrossDevicesDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_crossdevices;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_device")
    @NotNull
    private DevicesDomain id_devices_first;

    @NotNull
    private Integer id_devices_end;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private UsersDomain id_user_otv;

    private Integer id_user_old;

    @OneToOne
    @JoinColumn(name = "id_network_journal")
    private NetworkJournalDomain id_network_journal;

    private String description;

    @NotNull
    private Date date_reg;

    private Date date_old;

    @OneToOne(optional=false)
    @JoinColumn(name = "id_vlan")
    private VlanDomain id_vlan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_crosses")
    private CrossesDomain id_crosses;

    @NotNull
    private Integer actual;

    public CrossDevicesDomain() {
    }
}
