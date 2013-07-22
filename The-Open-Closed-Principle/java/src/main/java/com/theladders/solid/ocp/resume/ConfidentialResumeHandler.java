package com.theladders.solid.ocp.resume;

import com.theladders.solid.ocp.jobseeker.JobseekerConfidentialityProfile;
import com.theladders.solid.ocp.jobseeker.JobseekerConfidentialityProfileDao;
import com.theladders.solid.ocp.resume.category.ResumeCategories;
import com.theladders.solid.ocp.resume.category.ResumeCategory;
import com.theladders.solid.ocp.user.User;

public class ConfidentialResumeHandler
{
  private final JobseekerProfileManager jobSeekerProfileManager;
  private final JobseekerConfidentialityProfileDao jobseekerConfidentialityProfileDao;

  public ConfidentialResumeHandler(JobseekerProfileManager jobseekerProfileManager,
                                   JobseekerConfidentialityProfileDao jobseekerConfidentialityProfileDao)
  {
    this.jobSeekerProfileManager = jobseekerProfileManager;
    this.jobseekerConfidentialityProfileDao = jobseekerConfidentialityProfileDao;
  }

  public void makeConfidential(User user, ResumeCategories categories)
  {
      JobseekerProfile jsp = jobSeekerProfileManager.getJobSeekerProfile(user);
      JobseekerConfidentialityProfile profile = jobseekerConfidentialityProfileDao.fetchJobSeekerConfidentialityProfile(jsp.getId());

      for (ResumeCategory category: categories)
      {
          profile.resetConfidentialFlagsForCategory(category);
      }

      if (profile.isChanged())
      {
          generatePermanentConfidentialFiles(user, profile);
      }
  }

  @SuppressWarnings("unused")
  private void generatePermanentConfidentialFiles(User user,
                                                  JobseekerConfidentialityProfile profile)
  {
    // stub
  }
}
