package com.theladders.solid.ocp;

import com.theladders.solid.ocp.jobseeker.JobseekerConfidentialityProfileDao;
import com.theladders.solid.ocp.resume.*;
import com.theladders.solid.ocp.user.User;

public class App
{
  public static void main(String[] args)
  {
    JobseekerProfileManager jobseekerProfileManager = new JobseekerProfileManager();
    JobseekerConfidentialityProfileDao jobseekerConfidentialityProfileDao = new JobseekerConfidentialityProfileDao();
    ConfidentialResumeHandler confidentialResumeHandler = new ConfidentialResumeHandler(jobseekerProfileManager, jobseekerConfidentialityProfileDao);
    ResumeConfidentialityManager resumeConfidentialityManager = new ResumeConfidentialityManager(confidentialResumeHandler);

    int id = 1; // get from command line?
    User user = new User(id);

    resumeConfidentialityManager.makeConfidential(user, new ContactInfoCategories());
    resumeConfidentialityManager.makeConfidential(user, new AllResumeCategories());
  }
}
