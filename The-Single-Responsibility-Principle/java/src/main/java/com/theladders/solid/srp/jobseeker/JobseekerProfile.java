package com.theladders.solid.srp.jobseeker;

public class JobSeekerProfile {
    private final JobSeeker.Id id;
    private final ProfileStatus status;

    public JobSeekerProfile(JobSeeker.Id id) {
        this.id = id;
        this.status = ProfileStatus.NO_PROFILE;
    }

    public JobSeekerProfile(JobSeeker.Id id, ProfileStatus status) {
        this.id = id;
        this.status = status;
    }

    public JobSeeker.Id getId() {
        return id;
    }

    public boolean isComplete() {
        boolean completed = true;

        switch (status) {
            case INCOMPLETE:
            case NO_PROFILE:
            case REMOVED:
                completed = false;
                break;
        }
        return completed;
    }
}
