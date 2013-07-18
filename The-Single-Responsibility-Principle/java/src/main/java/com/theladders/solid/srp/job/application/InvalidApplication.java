package com.theladders.solid.srp.job.application;

import com.theladders.solid.srp.job.Job;

public class InvalidApplication extends JobApplicationResult {

    public InvalidApplication(Job job) {
        super(job);
    }

    @Override
    public Status getStatus() {
        return Status.FAILURE;
    }
}
