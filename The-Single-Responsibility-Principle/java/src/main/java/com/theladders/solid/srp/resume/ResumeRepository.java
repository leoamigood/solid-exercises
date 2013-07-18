package com.theladders.solid.srp.resume;

import com.theladders.solid.srp.jobseeker.JobSeeker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResumeRepository {
    private final Map<JobSeeker.Id, Resume> active = new HashMap<>();
    private final Map<JobSeeker.Id, List<Resume>> resumes = new HashMap<>();

    public void makeActive(JobSeeker.Id id, Resume resume) {
        active.put(id, resume);
    }

    public Resume activeResumeFor(JobSeeker.Id id) {
        return active.get(id);
    }

    public Resume saveResume(JobSeeker.Id id, Resume resume) {
        return addResumeForJobseeker(id, resume);
    }

    public boolean contains(Resume aResume) {
        for (JobSeeker.Id key : resumes.keySet()) {
            for (Resume resume : resumes.get(key)) {
                if (aResume.equals(resume)) return true;
            }
        }

        return false;
    }

    private Resume addResumeForJobseeker(JobSeeker.Id id, Resume resume) {
        List<Resume> jsResumes = resumes.get(id);

        if (jsResumes == null) {
            jsResumes = new ArrayList<>();
        }

        jsResumes.add(resume);

        resumes.put(id, jsResumes);

        return resume;
    }
}
