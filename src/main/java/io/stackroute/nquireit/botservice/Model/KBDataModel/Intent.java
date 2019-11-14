package io.stackroute.nquireit.botservice.Model.KBDataModel;


import org.neo4j.ogm.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

@NodeEntity
public class Intent {

    @Id
    @Property(name = "id")
    private Long id;

    @Property(name = "intent")
    private String intent;

    @Property(name = "created_at")
    private Date createdAt;

    @Property(name = "updated_at")
    private Date updatedAt;

    @Relationship(type = "HAS_ANSWER", direction = Relationship.DIRECTION)
    private
    List<Answer> answers;

    @Relationship(type = "HAS_TASK", direction = Relationship.DIRECTION)
    private
    List<Task> tasks;


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

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Intent() {
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }


    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "Intent{" +
                "id=" + id +
                ", intent='" + intent + '\'' +
                ", answers=" + answers +
                ", tasks=" + tasks +
                '}';
    }
}
