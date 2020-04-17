package progect.DTO.journal;

import lombok.Data;
import progect.domain.devices.DevicesDomain;
import progect.domain.journal.NetworkJournalDomain;
import progect.domain.network.NetworkDomain;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class NetworkJournalDTO {

    private Integer id_network_journal;

    private Integer id_network;
    private String network;

    private String DNS_zone;

    private Date date_reg;

    private Date date_old;

    private String ip_address;

    private Integer id_user_reg;
    private String user_reg;

    private Integer id_user_old;
    private String user_old;

    private DevicesDomain id_devices;
    private String devices;

    private Integer actual;


    public NetworkJournalDTO(NetworkJournalDomain obj) {
        this.id_network_journal = obj.getId_network_journal();
        this.id_network = obj.getId_network().getId_network();
        this.network = obj.getId_network().getNetworkInfo();
        this.DNS_zone = obj.getDNS_zone();
        this.date_reg = obj.getDate_reg();
        this.date_old = obj.getDate_old();
        this.ip_address = obj.getIp_address();
        this.id_user_reg = obj.getId_user_reg().getUser_id();
        this.user_reg = obj.getId_user_reg().getFioUser();
        this.id_user_old = obj.getId_user_old().getUser_id();
        this.user_old = obj.getId_user_old().getFioUser();
        this.id_devices = obj.getId_devices();
        this.devices = obj.getId_devices().getHostname();
        this.actual = obj.getActual();
    }

    @Override
    public String toString() {
        return "NetworkJournalDTO{" +
                "id_network_journal=" + id_network_journal +
                ", id_network=" + id_network +
                ", network='" + network + '\'' +
                ", DNS_zone='" + DNS_zone + '\'' +
                ", date_reg=" + date_reg +
                ", date_old=" + date_old +
                ", ip_address='" + ip_address + '\'' +
                ", id_user_reg=" + id_user_reg +
                ", user_reg='" + user_reg + '\'' +
                ", id_user_old=" + id_user_old +
                ", user_old='" + user_old + '\'' +
                ", id_devices=" + id_devices +
                ", devices='" + devices + '\'' +
                ", actual=" + actual +
                '}';
    }
}
