package com.Dheeraj.jobApp_REST.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class JobPost {
    @Id
    private int postId;
    private String postProfile;
    private String PostDesc;
    private int reqExperience;
    private List<String> postTechStack;

}
