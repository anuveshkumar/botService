package io.stackroute.nquireit.botservice.Controller;

import io.stackroute.nquireit.botservice.Model.KBDataModel.Intent;
import io.stackroute.nquireit.botservice.Model.KBDataModel.ResponsePost;
import io.stackroute.nquireit.botservice.Repository.KBRepository;
import io.stackroute.nquireit.botservice.Service.KBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bot/graph")
public class KBController {

    @Autowired
    private KBRepository kbRepository;

    @Autowired
    private KBService kbService;

    // get all intents
    @GetMapping("/getIntents")
    public List<String> getAllIntentsKB() {
        return kbService.findAllIntents();
    }

    // get specific intent (with it's corresponding tasks and answers)
    @GetMapping("/getIntent")
    public Intent getIntent(@RequestParam(name = "intent") String intent) {
        return kbRepository.getIntent(intent);
    }

    @PostMapping("/addAnswer")
    public Intent addAnswer(@RequestParam(name = "intent") String intent, @RequestBody ResponsePost responsePost) {
        return kbService.addAnswer(intent, responsePost);
    }

    @PostMapping("/addTask")
    public Intent addTask(@RequestParam(name = "intent") String intent, @RequestBody ResponsePost responsePost) {
        return kbService.addTask(intent, responsePost);
    }


    // create a new Intent

}

