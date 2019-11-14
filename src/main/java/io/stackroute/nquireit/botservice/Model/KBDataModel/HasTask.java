package io.stackroute.nquireit.botservice.Model.KBDataModel;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import java.util.Date;

@RelationshipEntity
public class HasTask {
    @StartNode
    Intent intent;

    @EndNode
    Task task;

    Date date;
}
