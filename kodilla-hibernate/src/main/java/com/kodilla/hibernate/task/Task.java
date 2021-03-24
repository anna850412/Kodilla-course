package com.kodilla.hibernate.task;

import com.sun.istack.NotNull;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;
@Entity
@Table(name="TASKS")
public class Task {

    private int id;
    private String description;
    private LocalTime created;
    private int duration;

    public Task() {
        this.created = LocalTime.now();
    }

    public Task(String description, int duration) {
        this.description = description;
        this.created = LocalTime.now();
        this.duration = duration;
    }
    @Id
    @GeneratedValue
    @NonNull
    @Column(name= "ID", unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }
    @NotNull
    @Column(name = "CREATED")
    public LocalTime getCreated() {
        return created;
    }
    @Column(name = "DURATION")
    public int getDuration() {
        return duration;
    }

    private void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private void setCreated(LocalTime created) {
        this.created = created;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }
}
