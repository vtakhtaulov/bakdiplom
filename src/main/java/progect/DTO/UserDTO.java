package progect.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

public class UserDTO {
    @JsonProperty(value = "user_id")
    private Integer user_id;
    @JsonProperty(value = "FamilyUser")
    private String FamilyUser;
    @JsonProperty(value = "NameUser")
    private String NameUser;
    @JsonProperty(value = "OtUser")
    private String OtUser;
    @JsonProperty(value = "Email")
    private String Email;
    @JsonProperty(value = "Phone")
    private String Phone;
    @JsonProperty(value = "UserLogin")
    private String UserLogin;

    @Override
    public String toString() {
        return "UserDTO{" +
                "user_id=" + user_id +
                ", FamilyUser='" + FamilyUser + '\'' +
                ", NameUser='" + NameUser + '\'' +
                ", OtUser='" + OtUser + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", UserLogin='" + UserLogin + '\'' +
                '}';
    }
}
