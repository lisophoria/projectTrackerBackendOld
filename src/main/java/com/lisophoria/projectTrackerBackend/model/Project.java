package com.lisophoria.projectTrackerBackend.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class Project {
    private Long projectId;
    private String projectName;

    public Project(String projectName) {
        this.projectName = projectName;
    }
}
