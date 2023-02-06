package test.reqres.models.lombok;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
public @Data class CreateUserLombokModel {


    private String name, job;

}
