package com.theladders.solid.srp.resume;

import com.theladders.solid.srp.ResumeAction;
import com.theladders.solid.srp.jobseeker.JobSeeker;

public class ResumeManager {
    private final ActiveResumeRepository active;
    private final ResumeRepository repository;

    public ResumeManager(ResumeRepository repository, ActiveResumeRepository active) {
        this.active = active;
        this.repository = repository;
    }

    public void saveAsActive(JobSeeker jobseeker, Resume resume) {
        active.makeActive(jobseeker.getId(), resume);
    }

    public Resume getActiveResume(JobSeeker.Id id) {
        return active.activeResumeFor(id);
    }

    public Resume saveResume(JobSeeker jobseeker, String fileName) {
        Resume resume = new Resume(fileName);
        return repository.saveResume(jobseeker.getId(), resume);
    }

    public Resume saveOrUpdate(JobSeeker jobseeker, String name, ResumeAction action) {
        Resume resume;
        switch (action) {
            case LOAD_ACTIVE:
                resume = getActiveResume(jobseeker.getId());
                break;

            case SAVE_AS_ACTIVE:
                resume = saveResume(jobseeker, name);
                repository.makeActive(jobseeker.getId(), resume);
                break;

            case NONE:
            default:
                resume = saveResume(jobseeker, name);
                break;
        }
        return resume;
    }
}
