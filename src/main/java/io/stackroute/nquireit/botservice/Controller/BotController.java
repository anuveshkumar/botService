package io.stackroute.nquireit.botservice.Controller;

import io.stackroute.nquireit.botservice.Service.BotService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/bot")
public class BotController {

    @Autowired
    BotService botService;

    @GetMapping("/getResponse")
    public String getResponse(@RequestParam String query) throws JSONException {
        return botService.getResponse(query);
    }
}
