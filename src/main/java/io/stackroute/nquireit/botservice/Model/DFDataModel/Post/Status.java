package io.stackroute.nquireit.botservice.Model.DFDataModel.Post;

public class Status {
    private String code;
    private String errorType;
    private String errorDetails;

    public Status() {
    }

    public Status(String code, String errorType, String errorDetails) {
        this.code = code;
        this.errorType = errorType;
        this.errorDetails = errorDetails;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public String getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
    }
}
