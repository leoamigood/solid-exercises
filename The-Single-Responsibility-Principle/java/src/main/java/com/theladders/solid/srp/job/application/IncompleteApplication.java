package com.theladders.solid.srp.job.application;

import com.theladders.solid.srp.job.Job;
import com.theladders.solid.srp.jobseeker.JobSeeker;
import com.theladders.solid.srp.resume.Resume;

public class IncompleteApplication extends FailedApplication {

    public IncompleteApplication(Job job) {
        super(job);
    }

    @Override
    public Status getStatus() {
        return Status.INCOMPLETE;
    }

}
