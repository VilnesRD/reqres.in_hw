package test.reqres.models.lombok.listResources;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public  class ListResourcesLombokModel {
    private int id = 2;
    private String name1 = "fuchsia rose",
            name2 = "true red";
}
