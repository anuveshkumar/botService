package io.stackroute.nquireit.botservice.Service;

import io.stackroute.nquireit.botservice.Model.KBDataModel.Intent;
import io.stackroute.nquireit.botservice.Model.KBDataModel.ResponsePost;
import io.stackroute.nquireit.botservice.Repository.KBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KBService {

    @Autowired
    private KBRepository kbRepository;

    public List<String> findAllIntents() {
        return kbRepository.findAllIntents();
    }

    public Intent addAnswer(String intent, ResponsePost responsePost) {
        return kbRepository.addAnswer(intent, responsePost.getId(), responsePost.getResponse());
    }

    public Intent addTask(String intent, ResponsePost responsePost){
        return kbRepository.addTask(intent, responsePost.getId(), responsePost.getResponse());
    }

    public Intent getIntent(String intent){
        return kbRepository.getIntent(intent);
    }

}
