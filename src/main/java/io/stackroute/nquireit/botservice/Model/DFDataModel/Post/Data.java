package io.stackroute.nquireit.botservice.Model.DFDataModel.Post;

public class Data {
    private String text;        // the actual text
    private String alias;       // the parameter name in the table
    private String meta;        // String starting with @, represents the entity in parameter table
    private boolean userDefined;// Signifies if Training Phrase was entered

    public Data() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public boolean isUserDefined() {
        return userDefined;
    }

    public void setUserDefined(boolean userDefined) {
        this.userDefined = userDefined;
    }
}
