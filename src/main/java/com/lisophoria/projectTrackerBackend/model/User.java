package com.lisophoria.projectTrackerBackend.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class User {
    private Long userId;
    private String username;
    private String fullname;

    public User(String username, String fullname) {
        this.username = username;
        this.fullname = fullname;
    }
}
