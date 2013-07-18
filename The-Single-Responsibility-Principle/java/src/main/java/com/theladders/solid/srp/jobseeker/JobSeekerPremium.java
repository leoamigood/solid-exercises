package com.theladders.solid.srp.jobseeker;

/**
 * Created with IntelliJ IDEA.
 * User: lamigud
 * Date: 7/17/13
 * Time: 3:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class JobSeekerPremium extends JobSeeker {
    public JobSeekerPremium(Id id) {
        super(id);
    }

    public JobSeekerPremium(Id id, JobSeekerProfile profile) {
        super(id, profile);
    }

    public boolean isPremium() {
        return true;
    }
}
