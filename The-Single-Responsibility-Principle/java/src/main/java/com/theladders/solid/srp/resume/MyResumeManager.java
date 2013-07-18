package com.theladders.solid.srp.resume;

import com.theladders.solid.srp.jobseeker.JobSeeker;

@Deprecated
public class MyResumeManager {
    private final ActiveResumeRepository repository;

    public MyResumeManager(ActiveResumeRepository repository) {
        this.repository = repository;
    }

    public void saveAsActive(JobSeeker jobseeker, Resume resume) {
        repository.makeActive(jobseeker.getId(), resume);
    }

    public Resume getActiveResume(JobSeeker.Id id) {
        return repository.activeResumeFor(id);
    }
}
