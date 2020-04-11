package progect.domain.user;

import lombok.Data;
import progect.domain.devices.DevicesDomain;
import progect.domain.journal.NetworkJournalDomain;
import progect.domain.network.NetworkDomain;
import progect.domain.network.Pool_address_Domain;
import progect.domain.room.RoomDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(schema = "auth", name = "users")
@Data
public class UsersDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    @NotNull
    private String last_name;

    @NotNull
    private String first_name;

    @NotNull
    private String middle_name;

    @NotNull
    private String email;

    @NotNull
    private String phone;

    @NotNull
    private String user_login;

    @NotNull
    private String user_password;

    @NotNull
    private String user_role;

    public UsersDomain() {
    }

}
