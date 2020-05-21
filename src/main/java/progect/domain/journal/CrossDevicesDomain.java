package progect.domain.journal;

import lombok.Data;
import progect.domain.RefStatusDomain;
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

    @ManyToOne
    @JoinColumn(name = "id_devices_first", referencedColumnName = "id_devices")
    @NotNull
    private DevicesDomain id_devices_first;

    @ManyToOne
    @JoinColumn(name = "id_devices_end", referencedColumnName = "id_devices")
    @NotNull
    private DevicesDomain id_devices_end;

    @ManyToOne
    @JoinColumn(name = "id_user_otv",referencedColumnName = "user_id")
    private UsersDomain id_user_otv;

    @ManyToOne
    @JoinColumn(name = "id_user_old",referencedColumnName = "user_id")
    private UsersDomain id_user_old;

    @OneToOne
    @JoinColumn(name = "id_network_journal")
    private NetworkJournalDomain id_network_journal;

    private String description;

    @NotNull
    private Date date_reg;

    private Date date_old;

    @OneToOne(optional = false)
    @JoinColumn(name = "id_vlan")
    private VlanDomain id_vlan;

    @ManyToOne
    @JoinColumn(name = "id_crosses")
    private CrossesDomain id_crosses;

    @ManyToOne
    @JoinColumn(name = "is_status",referencedColumnName ="id_status" )
    private RefStatusDomain is_status;

    public CrossDevicesDomain() {
    }

    public Integer getId_crossdevices() {
        return Id_crossdevices;
    }

    public void setId_crossdevices(Integer id_crossdevices) {
        Id_crossdevices = id_crossdevices;
    }

    public DevicesDomain getId_devices_first() {
        return id_devices_first;
    }

    public void setId_devices_first(DevicesDomain id_devices_first) {
        this.id_devices_first = id_devices_first;
    }

    public DevicesDomain getId_devices_end() {
        return id_devices_end;
    }

    public void setId_devices_end(DevicesDomain id_devices_end) {
        this.id_devices_end = id_devices_end;
    }

    public UsersDomain getId_user_otv() {
        return id_user_otv;
    }

    public void setId_user_otv(UsersDomain id_user_otv) {
        this.id_user_otv = id_user_otv;
    }

    public UsersDomain getId_user_old() {
        return id_user_old;
    }

    public void setId_user_old(UsersDomain id_user_old) {
        this.id_user_old = id_user_old;
    }

    public NetworkJournalDomain getId_network_journal() {
        return id_network_journal;
    }

    public void setId_network_journal(NetworkJournalDomain id_network_journal) {
        this.id_network_journal = id_network_journal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate_reg() {
        return date_reg;
    }

    public void setDate_reg(Date date_reg) {
        this.date_reg = date_reg;
    }

    public Date getDate_old() {
        return date_old;
    }

    public void setDate_old(Date date_old) {
        this.date_old = date_old;
    }

    public VlanDomain getId_vlan() {
        return id_vlan;
    }

    public void setId_vlan(VlanDomain id_vlan) {
        this.id_vlan = id_vlan;
    }

    public CrossesDomain getId_crosses() {
        return id_crosses;
    }

    public void setId_crosses(CrossesDomain id_crosses) {
        this.id_crosses = id_crosses;
    }

    public RefStatusDomain getIs_status() {
        return is_status;
    }

    public void setIs_status(RefStatusDomain is_status) {
        this.is_status = is_status;
    }
}
