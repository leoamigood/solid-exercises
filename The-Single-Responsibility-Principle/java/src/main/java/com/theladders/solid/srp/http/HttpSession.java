package com.theladders.solid.srp.http;

import com.theladders.solid.srp.jobseeker.JobSeeker;

public class HttpSession {
    private final JobSeeker jobseeker;

    public HttpSession(JobSeeker jobseeker) {
        this.jobseeker = jobseeker;
    }

    public JobSeeker getJobseeker() {
        return jobseeker;
    }
}
