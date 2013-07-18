package com.theladders.solid.srp.job.application;

import com.theladders.solid.srp.job.Job;
import com.theladders.solid.srp.jobseeker.JobSeeker;
import com.theladders.solid.srp.resume.Resume;

public class UnprocessedApplication {
    private final JobSeeker jobseeker;
    private final Job job;
    private final Resume resume;

    public UnprocessedApplication(JobSeeker jobseeker, Job job, Resume resume) {
        this.jobseeker = jobseeker;
        this.job = job;
        this.resume = resume;
    }

    public boolean isValid() {
        return jobseeker != null && job != null && resume != null;
    }

    public JobSeeker getJobseeker() {
        return jobseeker;
    }

    public Job getJob() {
        return job;
    }

    public Resume getResume() {
        return resume;
    }
}
