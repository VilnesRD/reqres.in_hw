package test.reqres.models.lombok.listUsers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ListUserLombokModel {
    private String  firstName ="Michael",
            lastName ="Lawson",
            email = "michael.lawson@reqres.in";
    private int id = 7;
}
