package com.lisophoria.projectTrackerBackend.repository.dao;

import com.lisophoria.projectTrackerBackend.model.Project;
import com.lisophoria.projectTrackerBackend.repository.mapper.ProjectMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProjectDao {
    private final NamedParameterJdbcTemplate template;

    public ProjectDao (NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    public Long createProject(Project project) {
        String sql = "insert into projects (project_name) values (:projectName) returning project_id";
        SqlParameterSource parameterSource = new MapSqlParameterSource()
                .addValue("projectName", project.getProjectName());

        return template.queryForObject(sql, parameterSource, Long.class);
    }

    public List<Project> getAllProjects() {
        String sql = "select * from projects";
        return template.query(sql, new ProjectMapper());
    }

    public List<Project> getProjectsByUser(Long userId) {
        String sql = "select projects.project_id, project_name " +
                "from projects left outer join project_user on project_user.project_id = projects.project_id " +
                "where project_user.user_id = " + userId;
        return template.query(sql, new ProjectMapper());
    }

}
