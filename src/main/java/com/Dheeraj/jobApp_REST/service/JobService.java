package com.Dheeraj.jobApp_REST.service;

import com.Dheeraj.jobApp_REST.Model.JobPost;
import com.Dheeraj.jobApp_REST.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo repo;
    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);
    }
    public List<JobPost> getAllJobs(){
       return repo.getAllJobs();
    }
    public JobPost getJob(int PostID){
        return repo.getJob(PostID);
    }
    public void updateJob(JobPost jobPost){
        repo.updateJob(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteJob(postId);
    }
}

