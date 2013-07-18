package com.theladders.solid.srp.job.policy;

import com.theladders.solid.srp.job.Job;
import com.theladders.solid.srp.jobseeker.JobSeeker;
import com.theladders.solid.srp.jobseeker.JobSeekerProfile;
import com.theladders.solid.srp.jobseeker.JobseekerProfileManager;

/**
 * Created with IntelliJ IDEA.
 * User: lamigud
 * Date: 7/17/13
 * Time: 3:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class PremiumCompletedProfilePolicy implements JobPolicy {
    private JobseekerProfileManager profileManager;

    public PremiumCompletedProfilePolicy(JobseekerProfileManager manager) {
        this.profileManager = manager;
    }

    @Override
    public boolean mayApply(JobSeeker jobseeker, Job job) {
        JobSeekerProfile profile = profileManager.getJobSeekerProfile(jobseeker);
        return jobseeker.isPremium() ||
                profile != null && profile.isComplete();
    }
}
