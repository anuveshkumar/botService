package io.stackroute.nquireit.botservice.Service;

import io.stackroute.nquireit.botservice.Model.DFDataModel.GetAll.IntentGet;
import io.stackroute.nquireit.botservice.Model.DFDataModel.Post.IntentPost;
import io.stackroute.nquireit.botservice.Model.DFDataModel.Post.IntentPostResponse;
import io.stackroute.nquireit.botservice.Model.DFDataModel.ProcessQuery.QueryContainer;
import io.stackroute.nquireit.botservice.Repository.DFRepository;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DFService {

    @Autowired
    private DFRepository dfRepository;

    public IntentPostResponse addIntent(IntentPost intentPost) {
        return dfRepository.addIntent(intentPost);
    }

    public List<IntentGet> findAllIntents() {
        // fetch all the intents from dialogflow
        return dfRepository.findAllIntents();
    }

    public String processQuery(String query) {
        QueryContainer queryContainer = new QueryContainer(query);
        return dfRepository.processQuery(queryContainer);
    }

    public String getIntent(String query) throws JSONException{
        JSONObject jsonObject = new JSONObject(processQuery(query));
        String intent =  jsonObject.getJSONObject("result").getJSONObject("metadata").getString("intentName");
        return intent;
    }


}
