package com.lisophoria.projectTrackerBackend.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Project {
    private Long projectId;
    private String projectName;

    public Project(String projectName) {
        this.projectName = projectName;
    }
}
