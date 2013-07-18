package com.theladders.solid.srp.resume;

import com.theladders.solid.srp.jobseeker.JobSeeker;

import java.util.HashMap;
import java.util.Map;


public class ActiveResumeRepository {
    private final Map<JobSeeker.Id, Resume> resumes;

    public ActiveResumeRepository() {
        this.resumes = new HashMap<>();
    }

    public Resume activeResumeFor(JobSeeker.Id id) {
        return resumes.get(id);
    }

    public void makeActive(JobSeeker.Id id, Resume resume) {
        resumes.put(id, resume);
    }
}
