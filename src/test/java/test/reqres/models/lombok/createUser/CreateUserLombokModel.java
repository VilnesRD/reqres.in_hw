package test.reqres.models.lombok.createUser;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CreateUserLombokModel {

    private String name, job;

}
