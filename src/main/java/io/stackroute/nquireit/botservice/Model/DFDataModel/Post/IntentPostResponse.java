package io.stackroute.nquireit.botservice.Model.DFDataModel.Post;

import java.util.Date;

public class IntentPostResponse {
    private String id;
    private Date timestamp;
    private String lang;
    private Status status;

    public IntentPostResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
