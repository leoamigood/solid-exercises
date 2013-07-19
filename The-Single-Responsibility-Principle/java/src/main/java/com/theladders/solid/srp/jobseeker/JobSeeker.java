package com.theladders.solid.srp.jobseeker;

public class JobSeeker {

    private JobSeekerProfile profile;

    private final Id id;

    public JobSeeker(Id id) {
        this.id = id;
        this.profile = new NoneJobSeekerProfile();
    }

    public JobSeeker(Id id, JobSeekerProfile profile) {
        this.id = id;
        this.profile = profile;
    }

    public static class Id {
        private final int id;

        public Id(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Id id1 = (Id) o;

            if (id != id1.id) return false;

            return true;
        }

        @Override
        public int hashCode() {
            return id;
        }

    }

    public Id getId() {
        return id;
    }

    public boolean isPremium() {
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id.id;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobSeeker jobSeeker = (JobSeeker) o;

        if (id != null ? !id.equals(jobSeeker.id) : jobSeeker.id != null) return false;

        return true;
    }
}
