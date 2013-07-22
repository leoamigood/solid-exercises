package com.theladders.solid.ocp.jobseeker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.theladders.solid.ocp.resume.ConfidentialPhrase;
import com.theladders.solid.ocp.resume.category.ResumeCategory;

public class JobseekerConfidentialityProfile
{
    private boolean isChanged = false;

    private Map<ResumeCategory, List<ConfidentialPhrase>> confidentialityProfile = new HashMap<ResumeCategory, List<ConfidentialPhrase>>();

    public boolean resetConfidentialFlagsForCategory(ResumeCategory category)
    {
        List<ConfidentialPhrase> phrases = this.getConfidentialPhrases(category);
        if (phrases != null) {
            for (ConfidentialPhrase phrase : phrases) {
                if (phrase.isConfidential()) {
                    phrase.setConfidential(false);
                    isChanged = true;
                }
            }
        }

        return isChanged;
    }

    public boolean isChanged()
    {
        return isChanged;
    }

    private List<ConfidentialPhrase> getConfidentialPhrases(ResumeCategory category)
    {
        return confidentialityProfile.get(category);
    }
}
