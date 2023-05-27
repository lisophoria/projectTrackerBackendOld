package com.lisophoria.projectTrackerBackend.repository.mapper;

import com.lisophoria.projectTrackerBackend.model.Project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

public class ProjectMapper implements RowMapper<Project> {
    @Override
    public Project mapRow(ResultSet rs, int rowNum) throws SQLException {
        Project project = new Project();
        project.setProjectId(rs.getLong("project_id"));
        project.setProjectName(rs.getString("project_name"));
        return project;
    }
}
