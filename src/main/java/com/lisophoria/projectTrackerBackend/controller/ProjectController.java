package com.lisophoria.projectTrackerBackend.controller;

import com.lisophoria.projectTrackerBackend.model.Project;
import com.lisophoria.projectTrackerBackend.repository.dao.ProjectDao;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/projects")
public class ProjectController {
    private final ProjectDao dao;

    public ProjectController(ProjectDao dao) {
        this.dao = dao;
    }

    @GetMapping
    public List<Project> getAllProjects() {
        return dao.getAllProjects();
    }

    @GetMapping("/user/{id}")
    public List<Project> getProjectsByUser(@PathVariable("id") Long id) {
        return dao.getProjectsByUser(id);
    }

    @PostMapping
    public Long createProject(@RequestBody Project project) {
        return dao.createProject(project);
    }
}
