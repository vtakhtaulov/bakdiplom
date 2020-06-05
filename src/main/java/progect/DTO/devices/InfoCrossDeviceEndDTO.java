package progect.DTO.devices;

import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table
public class InfoCrossDeviceEndDTO implements Serializable {
@Id
    private Integer id_devices;
    private String hostname;
    private String inventar_number;
    private Integer id_user_dev_otv;
    private String user_dev_otv;
    private Integer id_network_journal;
    private String ip_address;
    private Integer id_vlan;
    private String vlan_name;

    public InfoCrossDeviceEndDTO() {
    }
/*
    public InfoCrossDeviceEndDTO() {
        this.id_device = id_device;
        this.host_name = host_name;
        this.inventar_number = inventar_number;
        this.id_user_dev_otv = id_user_dev_otv;
        this.user_dev_otv = user_dev_otv;
        this.id_network_journal = id_network_journal;
        this.io_address = io_address;
        this.id_vlan = id_vlan;
        this.vlan_name = vlan_name;
    }*/

    public Integer getId_devices() {
        return id_devices;
    }

    public void setId_devices(Integer id_devices) {
        this.id_devices = id_devices;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getInventar_number() {
        return inventar_number;
    }

    public void setInventar_number(String inventar_number) {
        this.inventar_number = inventar_number;
    }

    public Integer getId_user_dev_otv() {
        return id_user_dev_otv;
    }

    public void setId_user_dev_otv(Integer id_user_dev_otv) {
        this.id_user_dev_otv = id_user_dev_otv;
    }

    public String getUser_dev_otv() {
        return user_dev_otv;
    }

    public void setUser_dev_otv(String user_dev_otv) {
        this.user_dev_otv = user_dev_otv;
    }

    public Integer getId_network_journal() {
        return id_network_journal;
    }

    public void setId_network_journal(Integer id_network_journal) {
        this.id_network_journal = id_network_journal;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public Integer getId_vlan() {
        return id_vlan;
    }

    public void setId_vlan(Integer id_vlan) {
        this.id_vlan = id_vlan;
    }

    public String getVlan_name() {
        return vlan_name;
    }

    public void setVlan_name(String vlan_name) {
        this.vlan_name = vlan_name;
    }

    @Override
    public String toString() {
        return "InfoCrossDeviceEndDTO{" +
                "id_devices=" + id_devices +
                ", hostname='" + hostname + '\'' +
                ", inventar_number='" + inventar_number + '\'' +
                ", id_user_dev_otv=" + id_user_dev_otv +
                ", user_dev_otv='" + user_dev_otv + '\'' +
                ", id_network_journal=" + id_network_journal +
                ", ip_address='" + ip_address + '\'' +
                ", id_vlan=" + id_vlan +
                ", vlan_name='" + vlan_name + '\'' +
                '}';
    }
}
