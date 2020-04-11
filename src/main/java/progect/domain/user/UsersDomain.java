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

    @Column(name = "last_name")
    @NotNull
    private String last_name;

    @Column(name = "first_name")
    @NotNull
    private String first_name;

    @Column(name = "middle_name")
    @NotNull
    private String middle_name;

    @Column(name = "email")
    @NotNull
    private String email;

    @Column(name = "phone")
    @NotNull
    private String phone;

    @Column(name = "user_login")
    @NotNull
    private String user_login;

    @Column(name = "user_password")
    @NotNull
    private String user_password;

    @Column(name = "user_role")
    @NotNull
    private String user_role;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user_otv")
    private List<DevicesDomain> user_otv_DevicesDomain;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user_otv")
    private List<RoomDomain> user_otv_RoomDomain;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_user_reg")
    private List<NetworkJournalDomain> id_user_reg_NetworkJournalDomain;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_user_old")
    private List<NetworkJournalDomain> id_user_old_NetworkJournalDomain;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_user_reg")
    private List<NetworkDomain> id_user_reg_NetworkDomain;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_user_old")
    private List<NetworkDomain> id_user_old_NetworkDomain;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_user_reg")
    private List<Pool_address_Domain> id_user_reg_Pool_address_Domain;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_user_old")
    private List<Pool_address_Domain> id_user_old_Pool_address_Domain;

    public UsersDomain() {
    }

}
