package progect.DTO.journal;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import progect.domain.devices.DevicesDomain;
import progect.domain.journal.CrossDevicesDomain;
import progect.domain.network.CrossesDomain;
import progect.domain.network.VlanDomain;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class CrossDevicesDTO {

    private Integer Id_crossdevices;

    private Integer id_devices_first;
    private String host_name_start;

    private Integer id_devices_end;
    private String host_name_end;

    private Integer id_user_otv;
    private String user_otv;

    private Integer id_user_old;
    private String user_old;

    private Integer id_network_journal;

    private String description;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Date date_reg;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Date date_old;

    private Integer id_vlan;
    private String name_vlan;

    private Integer id_crosses;
    private String info_crosses;

    private Integer actual;

    public CrossDevicesDTO() {
    }

    public CrossDevicesDTO(CrossDevicesDomain obj) {
        Id_crossdevices = obj.getId_crossdevices();
        this.id_devices_first = obj.getId_devices_first().getId_devices();
        this.host_name_start = obj.getId_devices_first().getHostname();
        this.id_devices_end = obj.getId_devices_end().getId_devices();
        this.host_name_end = obj.getId_devices_end().getHostname();
        this.id_user_otv = obj.getId_user_otv().getUser_id();
        this.user_otv = obj.getId_user_otv().getFioUser();
        this.id_user_old = obj.getId_user_old().getUser_id();
        this.user_old = obj.getId_user_old().getFioUser();
        this.id_network_journal = obj.getId_network_journal().getId_network_journal();
        this.description = obj.getDescription();
        this.date_reg = obj.getDate_reg();
        this.date_old = obj.getDate_old();
        this.id_vlan = obj.getId_vlan().getId_vlan();
        this.name_vlan = obj.getId_vlan().getVlan_name();
        this.id_crosses = obj.getId_crosses().getId_crosses_first();
        this.info_crosses = obj.getId_crosses().getInfoCrosses();
        this.actual = obj.getActual();
    }

    @Override
    public String toString() {
        return "CrossDevicesDTO{" +
                "Id_crossdevices=" + Id_crossdevices +
                ", id_devices_first=" + id_devices_first +
                ", host_name_start='" + host_name_start + '\'' +
                ", id_devices_end=" + id_devices_end +
                ", host_name_end='" + host_name_end + '\'' +
                ", id_user_otv=" + id_user_otv +
                ", user_otv='" + user_otv + '\'' +
                ", id_user_old=" + id_user_old +
                ", user_old='" + user_old + '\'' +
                ", id_network_journal=" + id_network_journal +
                ", description='" + description + '\'' +
                ", date_reg=" + date_reg +
                ", date_old=" + date_old +
                ", id_vlan=" + id_vlan +
                ", name_vlan='" + name_vlan + '\'' +
                ", id_crosses=" + id_crosses +
                ", info_crosses='" + info_crosses + '\'' +
                ", actual=" + actual +
                '}';
    }
}
