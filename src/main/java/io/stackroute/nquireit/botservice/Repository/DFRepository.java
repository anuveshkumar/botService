package io.stackroute.nquireit.botservice.Repository;

import io.stackroute.nquireit.botservice.Model.DFDataModel.GetAll.IntentGet;
import io.stackroute.nquireit.botservice.Model.DFDataModel.Post.IntentPost;
import io.stackroute.nquireit.botservice.Model.DFDataModel.Post.IntentPostResponse;
import io.stackroute.nquireit.botservice.Model.DFDataModel.ProcessQuery.QueryContainer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Repository
public class DFRepository {

    private static String baseUrl = "https://api.dialogflow.com/v1/";

    @Value("${df.developer.access.token}")
    private String accessToken;

    // add a new intent
    public IntentPostResponse addIntent(IntentPost intentPost) {
        String extensionUrl = "intents?v=20150910";
        String requestUrl = baseUrl + extensionUrl;
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(accessToken);
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<IntentPost> requestEntity = new HttpEntity<>(intentPost, headers);

        return restTemplate.postForObject(requestUrl, requestEntity, IntentPostResponse.class);
    }

//    public IntentPost getIntentByName(String intent) {
//
//    }

    public List<IntentGet> findAllIntents() {
        String extentionUrl = "intents?v=20150910";
        String requestUrl = baseUrl + extentionUrl;
        RestTemplate restTemplate = new RestTemplate();


        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(accessToken);
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity requestEntity = new HttpEntity(headers);

        ResponseEntity<List<IntentGet>> responseEntity = restTemplate.exchange(requestUrl, HttpMethod.GET, requestEntity, new ParameterizedTypeReference<List<IntentGet>>() {
        });
        List<IntentGet> intentList = responseEntity.getBody();
        return intentList;
    }

    // get a specific intent

    // get intel on query
    public String processQuery(QueryContainer container) {
        String extensionUrl = "query?v=20150910";
        String requestUrl = baseUrl + extensionUrl;


        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(accessToken);
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<QueryContainer> requestEntity = new HttpEntity<>(container, headers);
        RestTemplate template = new RestTemplate();
        String jsonString = template.exchange(requestUrl, HttpMethod.POST, requestEntity, String.class).getBody();
        return jsonString;
    }
}
