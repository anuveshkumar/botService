package io.stackroute.nquireit.botservice.Controller;


import io.stackroute.nquireit.botservice.Model.DFDataModel.GetAll.IntentGet;
import io.stackroute.nquireit.botservice.Model.DFDataModel.Post.IntentPost;
import io.stackroute.nquireit.botservice.Model.DFDataModel.Post.IntentPostResponse;
import io.stackroute.nquireit.botservice.Model.KBDataModel.Intent;
import io.stackroute.nquireit.botservice.Service.DFService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bot/dialogflow")
public class DFController {

    @Autowired
    private DFService dfService;


    // getting specific intent (returns the training phrases)


    // create new intent
    @PostMapping("/addIntent")
    public IntentPostResponse addIntentDF(@RequestBody IntentPost intentPost) {
        // add the intent to the dialogflow
        return dfService.addIntent(intentPost);
    }

    // retrieve all intents
    @GetMapping("/getIntents")
    public List<IntentGet> getAllIntentDF() {
        // fetch all the intents from dialogflow
        return dfService.findAllIntents();
    }

    @PostMapping("/processQuery")
    public String processQuery(@RequestParam("query") String query) throws JSONException {
        return dfService.processQuery(query);
    }

}
