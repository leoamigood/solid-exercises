package com.theladders.solid.srp.service;

import com.theladders.solid.srp.job.policy.JobPolicy;
import com.theladders.solid.srp.job.application.FailedApplication;
import com.theladders.solid.srp.job.application.JobApplicationResult;
import com.theladders.solid.srp.jobseeker.JobSeeker;

/**
 * Created with IntelliJ IDEA.
 * User: lamigud
 * Date: 7/17/13
 * Time: 2:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class JobServiceImpl implements JobService {

    @Override
    public JobApplicationResult apply(JobSeeker seeker, JobPolicy policy) {
        JobApplicationResult application = new FailedApplication();
        if (policy.mayApply(seeker)) {
            //application =
            //TODO: complete application process
        }

        return application;
    }
}
