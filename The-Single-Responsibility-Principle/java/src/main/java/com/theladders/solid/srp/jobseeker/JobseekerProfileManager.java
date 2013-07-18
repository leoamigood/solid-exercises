package com.theladders.solid.srp.jobseeker;


public class JobseekerProfileManager {
    private final JobseekerProfileRepository repository;

    public JobseekerProfileManager(JobseekerProfileRepository repository) {
        this.repository = repository;
    }

    public JobSeekerProfile getJobSeekerProfile(JobSeeker jobSeeker) {
        return repository.getProfile(jobSeeker.getId());
    }
}
