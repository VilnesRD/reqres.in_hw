package test.reqres.models.lombok.singleUser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class SingleUserLombokModel{
    private int id=2;
    private String first_name="Janet";
}
