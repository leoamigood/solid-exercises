package com.theladders.solid.srp.job.policy;

import com.theladders.solid.srp.job.Job;
import com.theladders.solid.srp.jobseeker.JobSeeker;

/**
 * Created with IntelliJ IDEA.
 * User: lamigud
 * Date: 7/17/13
 * Time: 2:46 PM
 * To change this template use File | Settings | File Templates.
 */
public interface JobPolicy {

    public boolean mayApply(JobSeeker seeker, Job job);

}
