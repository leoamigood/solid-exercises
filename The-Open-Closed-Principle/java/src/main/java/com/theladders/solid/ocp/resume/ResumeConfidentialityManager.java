package com.theladders.solid.ocp.resume;

import com.theladders.solid.ocp.resume.category.ResumeCategories;
import com.theladders.solid.ocp.user.User;

public class ResumeConfidentialityManager
{
    private final ConfidentialResumeHandler confidentialResumeHandler;

    public ResumeConfidentialityManager(ConfidentialResumeHandler confidentialResumeHandler)
    {
        this.confidentialResumeHandler = confidentialResumeHandler;
    }

    public void makeConfidential(User user, ResumeCategories categories)
    {
        confidentialResumeHandler.makeConfidential(user, categories);
    }

}
