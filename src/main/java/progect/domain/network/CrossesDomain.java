package progect.domain.network;

import lombok.Data;
import org.omg.CORBA.INTERNAL;

import javax.persistence.*;

@Entity
@Data
@Table(schema = "network", name = "Crosses")
public class CrossesDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id_crosses_first;

    private Integer id_crosses_end;

    private Integer shkaf;

    private Integer slot;

    private Integer port;
}
