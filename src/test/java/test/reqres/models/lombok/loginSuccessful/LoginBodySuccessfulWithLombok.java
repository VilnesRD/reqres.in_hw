package test.reqres.models.lombok.loginSuccessful;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class LoginBodySuccessfulWithLombok {

    private String email,
            password;
}
