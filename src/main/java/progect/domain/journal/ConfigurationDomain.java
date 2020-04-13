package progect.domain.journal;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.ValueGenerationType;
import progect.domain.devices.DevicesDomain;
import progect.domain.devices.PropsPortDomain;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@Table(schema = "network", name = "Configuration")
public class ConfigurationDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_config;

    @OneToOne
    @JoinColumn(name = "id_device")
    private DevicesDomain id_divice;

    private String config_first;

    private String config_last;

    private String deference;

    @ManyToOne
    @JoinColumn(name = "id_user_reg",referencedColumnName = "user_id")
    private UsersDomain id_user_reg;

    @ManyToOne
    @JoinColumn(name = "id_user_old",referencedColumnName = "user_id")
    private UsersDomain id_user_old;

    @NotNull
    private Date date_reg;

    private Date date_old;

    private Integer actual;
}
