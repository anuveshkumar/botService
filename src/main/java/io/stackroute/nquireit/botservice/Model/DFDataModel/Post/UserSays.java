package io.stackroute.nquireit.botservice.Model.DFDataModel.Post;

import java.util.List;

public class UserSays {
    private List<Data> data;
    private boolean isTemplate;
    private Integer count;
    private Integer updated;
    private boolean isAuto;

    public UserSays(List<Data> data) {
        this.data = data;
    }

    public UserSays() {
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}
