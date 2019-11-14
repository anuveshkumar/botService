package io.stackroute.nquireit.botservice.Model.DFDataModel.ProcessQuery;

public class QueryContainer {
    private String lang;
    private String query;
    private String sessionId;

    public QueryContainer(String query) {
        this.lang = "en";
        this.query = query;
        this.sessionId = "12345";
    }

    public QueryContainer(String lang, String query) {
        this.lang = lang;
        this.query = query;
    }

    public QueryContainer(String lang, String query, String sessionId) {
        this.lang = lang;
        this.query = query;
        this.sessionId = sessionId;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
