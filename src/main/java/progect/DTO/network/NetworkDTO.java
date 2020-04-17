package progect.DTO.network;

import com.fasterxml.jackson.annotation.JsonFormat;
import progect.domain.network.NetworkDomain;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class NetworkDTO {

    private Integer id_network;

    private String pool_address;
    private Integer id_pool_address;

    private String user_reg;
    private Integer id_user_reg;

    private String user_old;
    private Integer id_user_old;

    private String vlan;
    private Integer id_vlan;

    private String dhcp_pool;
    private Integer id_dhcp_pool;

    private String ip_address_network;

    private String networkMask;

    private Integer number_mstp;

    private Integer defaultGeteway;

    private Date date_reg;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Date date_old;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Integer actual;

    public NetworkDTO(NetworkDomain net) {
        this.id_network = net.getId_network();
        this.pool_address = net.getPoolIpAddress();
        this.id_pool_address = net.getId_pool_address().getId_pool_address();
        this.user_reg = net.getId_user_reg().getFioUser();
        this.user_old = net.getId_user_old().getFioUser();
        this.id_user_old = net.getId_user_old().getUser_id();
        this.id_user_reg = net.getId_user_reg().getUser_id();
        this.vlan = net.getVlan();
        this.id_vlan = net.getId_vlan().getId_vlan();
        this.dhcp_pool = net.getDHCPPoolIpAddress();
        this.id_dhcp_pool = net.getId_DHСP_pool().getId_DHСP_pool();
        this.ip_address_network = net.getIp_address_network();
        this.networkMask = net.getNetworkMask();
        this.number_mstp = net.getNumber_mstp();
        this.defaultGeteway = net.getDefaultGeteway();
        this.date_reg = net.getDate_reg();
        this.date_old = net.getDate_old();
        this.actual = net.getActual();
    }

    public Integer getId_network() {
        return id_network;
    }

    public void setId_network(Integer id_network) {
        this.id_network = id_network;
    }

    public String getPool_address() {
        return pool_address;
    }

    public void setPool_address(String pool_address) {
        this.pool_address = pool_address;
    }

    public Integer getId_pool_address() {
        return id_pool_address;
    }

    public void setId_pool_address(Integer id_pool_address) {
        this.id_pool_address = id_pool_address;
    }

    public String getUser_reg() {
        return user_reg;
    }

    public void setUser_reg(String user_reg) {
        this.user_reg = user_reg;
    }

    public Integer getId_user_reg() {
        return id_user_reg;
    }

    public void setId_user_reg(Integer id_user_reg) {
        this.id_user_reg = id_user_reg;
    }

    public String getUser_old() {
        return user_old;
    }

    public void setUser_old(String user_old) {
        this.user_old = user_old;
    }

    public Integer getId_user_old() {
        return id_user_old;
    }

    public void setId_user_old(Integer id_user_old) {
        this.id_user_old = id_user_old;
    }

    public String getVlan() {
        return vlan;
    }

    public void setVlan(String vlan) {
        this.vlan = vlan;
    }

    public Integer getId_vlan() {
        return id_vlan;
    }

    public void setId_vlan(Integer id_vlan) {
        this.id_vlan = id_vlan;
    }

    public String getDhcp_pool() {
        return dhcp_pool;
    }

    public void setDhcp_pool(String dhcp_pool) {
        this.dhcp_pool = dhcp_pool;
    }

    public Integer getId_dhcp_pool() {
        return id_dhcp_pool;
    }

    public void setId_dhcp_pool(Integer id_dhcp_pool) {
        this.id_dhcp_pool = id_dhcp_pool;
    }

    public String getIp_address_network() {
        return ip_address_network;
    }

    public void setIp_address_network(String ip_address_network) {
        this.ip_address_network = ip_address_network;
    }

    public String getNetworkMask() {
        return networkMask;
    }

    public void setNetworkMask(String networkMask) {
        this.networkMask = networkMask;
    }

    public Integer getNumber_mstp() {
        return number_mstp;
    }

    public void setNumber_mstp(Integer number_mstp) {
        this.number_mstp = number_mstp;
    }

    public Integer getDefaultGeteway() {
        return defaultGeteway;
    }

    public void setDefaultGeteway(Integer defaultGeteway) {
        this.defaultGeteway = defaultGeteway;
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

    public Integer getActual() {
        return actual;
    }

    public void setActual(Integer actual) {
        this.actual = actual;
    }

    @Override
    public String toString() {
        return "NetworkDTO{" +
                "id_network=" + id_network +
                ", pool_address='" + pool_address + '\'' +
                ", id_pool_address=" + id_pool_address +
                ", user_reg='" + user_reg + '\'' +
                ", id_user_reg=" + id_user_reg +
                ", user_old='" + user_old + '\'' +
                ", id_user_old=" + id_user_old +
                ", vlan='" + vlan + '\'' +
                ", id_vlan=" + id_vlan +
                ", dhcp_pool='" + dhcp_pool + '\'' +
                ", id_dhcp_pool=" + id_dhcp_pool +
                ", ip_address_network='" + ip_address_network + '\'' +
                ", networkMask='" + networkMask + '\'' +
                ", number_mstp=" + number_mstp +
                ", defaultGeteway=" + defaultGeteway +
                ", date_reg=" + date_reg +
                ", date_old=" + date_old +
                ", actual=" + actual +
                '}';
    }
}
