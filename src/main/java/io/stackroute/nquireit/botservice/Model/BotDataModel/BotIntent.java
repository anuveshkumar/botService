package io.stackroute.nquireit.botservice.Model.BotDataModel;

import io.stackroute.nquireit.botservice.Model.DFDataModel.Post.IntentPost;
import io.stackroute.nquireit.botservice.Model.KBDataModel.ResponsePost;

public class BotIntent {
    private IntentPost intentPost;
    private ResponsePost responsePost;

    public BotIntent() {
    }

    public IntentPost getIntentPost() {
        return intentPost;
    }

    public void setIntentPost(IntentPost intentPost) {
        this.intentPost = intentPost;
    }

    public ResponsePost getResponsePost() {
        return responsePost;
    }

    public void setResponsePost(ResponsePost responsePost) {
        this.responsePost = responsePost;
    }
}
