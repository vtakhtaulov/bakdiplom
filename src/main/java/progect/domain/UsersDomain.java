package progect.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(schema = "auth", name = "program_users")
@Data
public class UsersDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer user_id;

    @Column(name = "FamilyUser")
    @NotNull
    private String FamilyUser;

    @Column(name = "NameUser")
    @NotNull
    private String NameUser;

    @Column(name = "OtUser")
    @NotNull
    private String OtUser;

    @Column(name = "Email")
    @NotNull
    private String Email;

    @Column(name = "Phone")
    @NotNull
    private String Phone;

    @Column(name = "UserLogin")
    @NotNull
    private String UserLogin;

    @Column(name = "UserPassword")
    @NotNull
    private String UserPassword;

    public UsersDomain() {
    }

    public UsersDomain(String FamilyUser, String NameUser, String OtUser, String Email, String Phone,String UserLogin,String UserPassword) {
        this.FamilyUser = FamilyUser;
        this.NameUser = NameUser;
        this.OtUser = OtUser;
        this.Email = Email;
        this.Phone = Phone;
        this.UserLogin = UserLogin;
        this.UserPassword = UserPassword;
    }
}
