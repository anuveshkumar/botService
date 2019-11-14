package io.stackroute.nquireit.botservice.Model.KBDataModel;


import org.apache.tomcat.jni.Time;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

import java.util.Date;

@NodeEntity
public class Answer {

    @Id
    @GeneratedValue
    private Long id;

    @Property(name = "answer")
    private String answer;

    @Property(name = "created_at")
    private Date createdAt;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Answer(String answer) {
        this.answer = answer;
    }

    public Answer() {
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
