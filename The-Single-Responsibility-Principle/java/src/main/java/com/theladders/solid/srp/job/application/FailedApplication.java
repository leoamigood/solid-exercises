package com.theladders.solid.srp.job.application;

import com.theladders.solid.srp.job.Job;

public class FailedApplication extends JobApplicationResult {

    public FailedApplication(Job job) {
        super(job);
    }

    @Override
    public Status getStatus() {
        return Status.FAILURE;
    }
}
