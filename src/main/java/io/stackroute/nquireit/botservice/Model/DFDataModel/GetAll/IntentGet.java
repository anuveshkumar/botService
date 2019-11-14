package io.stackroute.nquireit.botservice.Model.DFDataModel.GetAll;

import java.util.List;

public class IntentGet {
    private String id;
    private String name;
    private List<Parameter> parameters;

    public IntentGet() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }
}
