package com.theladders.solid.srp.job.policy;

import com.theladders.solid.srp.jobseeker.*;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: lamigud
 * Date: 7/17/13
 * Time: 3:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class PremiumCompletedProfilePolicyTest {

    JobPolicy policy = new PremiumCompletedProfilePolicy(new JobseekerProfileManager(new JobseekerProfileRepository()));

    @Test
    public void testMayApply() throws Exception {
        JobSeekerProfile approved = new JobSeekerProfile(new JobSeeker.Id(1), ProfileStatus.APPROVED);
        JobSeekerProfile declined = new JobSeekerProfile(new JobSeeker.Id(1), ProfileStatus.DECLINED);
        JobSeekerProfile incomplete = new JobSeekerProfile(new JobSeeker.Id(1), ProfileStatus.INCOMPLETE);
        JobSeekerProfile removed = new JobSeekerProfile(new JobSeeker.Id(1), ProfileStatus.REMOVED);

        assertTrue(policy.mayApply(new JobSeekerPremium(new JobSeeker.Id(1), approved), null));
        assertTrue(policy.mayApply(new JobSeekerPremium(new JobSeeker.Id(2), declined), null));
        assertTrue(policy.mayApply(new JobSeekerPremium(new JobSeekerPremium.Id(3), incomplete), null));
        assertTrue(policy.mayApply(new JobSeekerPremium(new JobSeekerPremium.Id(4), removed), null));

        assertFalse(policy.mayApply(new JobSeeker(new JobSeeker.Id(1)), null));
        assertFalse(policy.mayApply(new JobSeeker(new JobSeekerPremium.Id(1)), null));
        assertFalse(policy.mayApply(new JobSeeker(new JobSeekerPremium.Id(1), approved), null));
        assertFalse(policy.mayApply(new JobSeeker(new JobSeekerPremium.Id(2), declined), null));
    }
}
