package test.reqres.models.lombok.loginSuccessful;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
public @Data class RegisterBodySuccessfulWithLombok {

    private String email,
            password;


}
