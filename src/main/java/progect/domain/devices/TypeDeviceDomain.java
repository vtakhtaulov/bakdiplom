package progect.domain.devices;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Table(schema = "network", name = "type_device")
public class TypeDeviceDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_type_dev;

    @NotNull
    private String name_type_dev;


    public TypeDeviceDomain(){}
}
