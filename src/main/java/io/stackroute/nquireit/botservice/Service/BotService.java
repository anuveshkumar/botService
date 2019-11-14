package io.stackroute.nquireit.botservice.Service;

import io.stackroute.nquireit.botservice.Model.BotDataModel.BotIntent;
import io.stackroute.nquireit.botservice.Model.DFDataModel.Post.IntentPostResponse;
import io.stackroute.nquireit.botservice.Model.KBDataModel.Answer;
import io.stackroute.nquireit.botservice.Model.KBDataModel.Intent;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Comparator;
import java.util.List;

public class BotService {

    @Autowired
    private KBService kbService;

    @Autowired
    private DFService dfService;

    public String getResponse(String query) throws JSONException {
        // extract the intent
        String intentName = dfService.getIntent(query);

        // retrieve the corresponding tasks and answers of that intent from knowledge base
        Intent intent = kbService.getIntent(intentName);

        // sort the answers by date and give the latest answer
        List<Answer> answers = intent.getAnswers();

        Comparator<Answer> compareByDate = (Answer a1, Answer a2) -> a1.getCreatedAt().compareTo(a2.getCreatedAt());
        answers.sort(compareByDate.reversed());
        return answers.get(0).getAnswer();
    }

    public void addAnswer(BotIntent botIntent) {
        IntentPostResponse response = dfService.addIntent(botIntent.getIntentPost());
        String id = response.getId();
        kbService.addAnswer(botIntent.getIntentPost().getName(), botIntent.getResponsePost());
    }

    public void addTask(BotIntent botIntent){
        IntentPostResponse response = dfService.addIntent(botIntent.getIntentPost());
        String id = response.getId();
        kbService.addTask(botIntent.getIntentPost().getName(), botIntent.getResponsePost());
    }

    // delete intent

}
