package com.theladders.solid.srp.job;

import java.util.HashMap;
import java.util.Map;

public class JobRepository {
    private final Map<Job.Id, Job> jobs = new HashMap<>();

    public void addJob(Job job) {
        jobs.put(job.getJobId(), job);
    }

    public Job getJob(Job.Id id) {
        return jobs.get(id);
    }
}
