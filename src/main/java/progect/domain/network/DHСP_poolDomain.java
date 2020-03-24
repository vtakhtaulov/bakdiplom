package progect.domain.network;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(schema = "network", name = "DHСP_poolDomain")
public class DHСP_poolDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_DHСP_pool;

    @Column(name = "address_start")
    @NotNull
    private String address_start;

    @Column(name = "address_end")
    @NotNull
    private String address_end;

    public DHСP_poolDomain(){}
}
