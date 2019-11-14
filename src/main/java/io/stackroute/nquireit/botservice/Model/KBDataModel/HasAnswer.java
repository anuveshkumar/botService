package io.stackroute.nquireit.botservice.Model.KBDataModel;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity
public class HasAnswer {

    @StartNode
    Intent intent;

    @EndNode
    Answer answer;

}
