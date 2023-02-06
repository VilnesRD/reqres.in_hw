package test.reqres.models.lombok.loginSuccessful;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class LoginResponseSuccessfulWithLombok {

    private String token = "QpwL5tke4Pnpja7X4";

}
