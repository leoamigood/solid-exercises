package com.theladders.solid.srp.service;

import com.theladders.solid.srp.job.Job;
import com.theladders.solid.srp.job.application.*;
import com.theladders.solid.srp.job.policy.JobPolicy;
import com.theladders.solid.srp.jobseeker.JobSeeker;
import com.theladders.solid.srp.jobseeker.JobSeekerProfile;
import com.theladders.solid.srp.jobseeker.JobseekerProfileManager;
import com.theladders.solid.srp.resume.Resume;
import com.theladders.solid.srp.resume.ResumeManager;

/**
 * Created with IntelliJ IDEA.
 * User: lamigud
 * Date: 7/17/13
 * Time: 2:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class JobServiceImpl implements JobService {
    private JobseekerProfileManager profileManager;
    private JobApplicationSystem jobApplicationSystem;
    private ResumeManager resumeManager;

    public JobServiceImpl(JobApplicationSystem jobApplicationSystem, ResumeManager resumeManager) {
        this.jobApplicationSystem = jobApplicationSystem;
        this.resumeManager = resumeManager;
    }

    @Override
    public JobApplicationResult apply(JobSeeker seeker, Resume resume, Job job, JobPolicy policy) {
        JobApplicationResult result = new IncompleteApplication(job);
        try {
            if (job == null) return new InvalidApplication(job);
            if (!resume.isValid()) return new FailedApplication(job);

            if (policy.mayApply(seeker, job)) {
                UnprocessedApplication application = new UnprocessedApplication(seeker, job, resume);

                result = jobApplicationSystem.apply(application);
            }
        } catch (Exception ex) {
            result = new FailedApplication(job);
        }
        return result;
    }
}
