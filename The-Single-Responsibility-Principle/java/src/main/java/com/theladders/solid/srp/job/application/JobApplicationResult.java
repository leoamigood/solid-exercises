package com.theladders.solid.srp.job.application;

import com.theladders.solid.srp.job.Job;

public abstract class JobApplicationResult {

    public static enum Status {
        SUCCESS,
        FAILURE,
        INVALID,
        INCOMPLETE;
    }

    public abstract Status getStatus();

    private Job.Id jobId;
    private String jobTitle;

    public JobApplicationResult(Job job) {
        this.jobId = job.getJobId();
        this.jobTitle = job.getTitle();
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public Job.Id getJobId() {
        return jobId;
    }

}
