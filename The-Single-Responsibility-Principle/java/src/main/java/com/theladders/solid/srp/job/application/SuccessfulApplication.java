package com.theladders.solid.srp.job.application;

import com.theladders.solid.srp.job.Job;
import com.theladders.solid.srp.jobseeker.JobSeeker;
import com.theladders.solid.srp.resume.Resume;

public class SuccessfulApplication extends JobApplicationResult {
    private final JobSeeker jobSeeker;
    private final Job job;
    private final Resume resume;

    public SuccessfulApplication(JobSeeker jobseeker, Job job, Resume resume) {
        super(job);

        this.jobSeeker = jobseeker;
        this.job = job;
        this.resume = resume;
    }

    @Override
    public Status getStatus() {
        return Status.SUCCESS;
    }

    public JobSeeker getJobSeeker() {
        return jobSeeker;
    }

    public Job getJob() {
        return job;
    }
}
