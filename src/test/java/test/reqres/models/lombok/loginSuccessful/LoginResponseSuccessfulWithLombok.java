package test.reqres.models.lombok.registrSuccessful;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
public @Data class RegisterResponseSuccessfulWithLombok {

    private int year;

}
