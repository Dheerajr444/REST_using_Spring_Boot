package com.Dheeraj.jobApp_REST.controller;

import com.Dheeraj.jobApp_REST.Model.JobPost;
import com.Dheeraj.jobApp_REST.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController {
    @Autowired
    private JobService service;
    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){
       return service.getAllJobs();
    }
    @GetMapping("jobPost/{postID}")
    public JobPost getJob(@PathVariable("postID") int postID){
        return service.getJob(postID);
    }
    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }
    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }
    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId){
        service.deleteJob(postId);
        return "Deleted";
    }

}
