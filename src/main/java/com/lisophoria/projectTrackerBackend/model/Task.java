package com.lisophoria.projectTrackerBackend.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

enum TaskStatuses {
    TODO,
    IN_PROGRESS,
    CANCELLED,
    REVIEW,
    DONE,
}

@Data
@Getter
@Setter
public class Task {
    private Long taskId;
    private User user;
    private Project project;
    private String summary;
    private String description;
    private TaskStatuses status;

    public Task(User user, Project project, String summary, String description, TaskStatuses status) {
        this.user = user;
        this.project = project;
        this.summary = summary;
        this.description = description;
        this.status = status;
    }

    public Task(Long taskId, User user, Project project, String summary, TaskStatuses status) {
        this.user = user;
        this.project = project;
        this.summary = summary;
        this.status = status;
    }
}
