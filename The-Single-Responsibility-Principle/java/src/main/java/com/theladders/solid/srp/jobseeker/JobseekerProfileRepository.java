package com.theladders.solid.srp.jobseeker;

import java.util.HashMap;
import java.util.Map;

public class JobseekerProfileRepository {
    private Map<JobSeeker.Id, JobSeekerProfile> profiles = new HashMap<>();

    public JobSeekerProfile getProfile(JobSeeker.Id id) {
        return profiles.get(id);
    }

    public void addProfile(JobSeekerProfile profile) {
        profiles.put(profile.getId(), profile);
    }
}
