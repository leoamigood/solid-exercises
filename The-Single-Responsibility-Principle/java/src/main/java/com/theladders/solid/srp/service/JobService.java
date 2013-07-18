package com.theladders.solid.srp.service;

import com.theladders.solid.srp.job.Job;
import com.theladders.solid.srp.job.policy.JobPolicy;
import com.theladders.solid.srp.job.application.JobApplicationResult;
import com.theladders.solid.srp.jobseeker.JobSeeker;
import com.theladders.solid.srp.resume.Resume;

/**
 * Created with IntelliJ IDEA.
 * User: lamigud
 * Date: 7/17/13
 * Time: 2:42 PM
 * To change this template use File | Settings | File Templates.
 */
public interface JobService {

    public JobApplicationResult apply(JobSeeker seeker, Resume resume, Job job, JobPolicy policy);

}
