package com.theladders.solid.srp;

import com.theladders.solid.srp.http.HttpRequest;
import com.theladders.solid.srp.http.HttpResponse;
import com.theladders.solid.srp.job.Job;
import com.theladders.solid.srp.job.JobSearchService;
import com.theladders.solid.srp.job.application.JobApplicationRequestParser;
import com.theladders.solid.srp.job.application.JobApplicationResult;
import com.theladders.solid.srp.job.application.JobApplicationSystem;
import com.theladders.solid.srp.job.policy.JobPolicy;
import com.theladders.solid.srp.jobseeker.JobSeeker;
import com.theladders.solid.srp.resume.Resume;
import com.theladders.solid.srp.resume.ResumeManager;
import com.theladders.solid.srp.service.JobService;

public class ApplyController
{
    private JobApplicationRequestParser parser = new JobApplicationRequestParser();

    private final JobSearchService jobSearchService;
    private final ResumeManager resumeManager;

    private JobService jobService;
    private JobPolicy policy;

    public ApplyController(JobService jobService, JobSearchService jobSearchService, ResumeManager resumeManager, JobPolicy policy)
    {
        this.jobService = jobService;
        this.jobSearchService = jobSearchService;
        this.resumeManager = resumeManager;
        this.policy = policy;
    }

    public HttpResponse handle(HttpRequest request, HttpResponse response, String name)
    {
        JobSeeker jobseeker = parser.getJobSeeker(request);
        Job job = jobSearchService.getJob(parser.getJobId(request));

        Resume resume = resumeManager.saveOrUpdate(jobseeker, name, parser.getResumeAction(request));

        JobApplicationResult application = jobService.apply(jobseeker, resume, job, policy);
        response.setResult(application);

        return response;
    }

}

