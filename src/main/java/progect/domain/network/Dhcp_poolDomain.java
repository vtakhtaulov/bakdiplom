package progect.domain.network;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(schema = "network", name = "DHСP_pool")
public class Dhcp_poolDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_DHСP_pool;

    @NotNull
    private String address_start;

    @Column(name = "address_end")
    @NotNull
    private String address_end;

    @OneToOne
    @JoinColumn(name = "id_DHСP_pool", referencedColumnName = "id_network")
    private NetworkDomain id_network;

    public Dhcp_poolDomain(){}

    public Integer getId_DHСP_pool() {
        return id_DHСP_pool;
    }

    public void setId_DHСP_pool(Integer id_DHСP_pool) {
        this.id_DHСP_pool = id_DHСP_pool;
    }

    public String getAddress_start() {
        return address_start;
    }

    public void setAddress_start(String address_start) {
        this.address_start = address_start;
    }

    public String getAddress_end() {
        return address_end;
    }

    public void setAddress_end(String address_end) {
        this.address_end = address_end;
    }

    public NetworkDomain getId_network() {
        return id_network;
    }

    public void setId_network(NetworkDomain id_network) {
        this.id_network = id_network;
    }
}
