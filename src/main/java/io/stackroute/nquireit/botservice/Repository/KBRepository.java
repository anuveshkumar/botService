package io.stackroute.nquireit.botservice.Repository;

import io.stackroute.nquireit.botservice.Model.KBDataModel.Intent;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KBRepository extends Neo4jRepository<Intent, Long> {

    Intent findByIntent(String intent);

    @Query("MATCH (i:Intent) return i.intent")
    List<String> findAllIntents();

    // Get a specific intent and it's corresponding tasks and
    @Query("MATCH (i:Intent {intent: {0} })-[r]->(b) RETURN i, r, b;")
    Intent getIntent(String intent);

    // Find an intent and add a new answer to it
    @Query("MERGE(i:Intent {intent: {intent} }) ON MATCH SET i.updated_at = datetime() ON CREATE SET i.created_at = datetime(), i.id={id} MERGE (a:Answer {answer:{answer} }) ON CREATE SET a.created_at = datetime() MERGE (i)-[r:HAS_ANSWER]->(a) RETURN i, r, a;")
    Intent addAnswer(String intent, String id, String answer);

    // Find an intent and add a new task to it
    @Query("MERGE(i:Intent {intent: {intent} }) ON MATCH SET i.updated_at = datetime() ON CREATE SET i.created_at = datetime(), i.id={id} MERGE (t:Task {task:{task} }) ON CREATE SET t.created_at = datetime() MERGE (i)-[r:HAS_TASK]->(t) RETURN i, r, a;")
    Intent addTask(String intent, String id, String answer);


}
