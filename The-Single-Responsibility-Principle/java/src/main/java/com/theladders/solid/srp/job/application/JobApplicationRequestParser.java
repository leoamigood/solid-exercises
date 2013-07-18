package com.theladders.solid.srp.job.application;

import com.theladders.solid.srp.ResumeAction;
import com.theladders.solid.srp.http.HttpRequest;
import com.theladders.solid.srp.job.Job;
import com.theladders.solid.srp.jobseeker.JobSeeker;
import com.theladders.solid.srp.resume.Resume;

/**
 * Created with IntelliJ IDEA.
 * User: lamigud
 * Date: 7/18/13
 * Time: 2:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class JobApplicationRequestParser {

    public JobSeeker getJobSeeker(HttpRequest request) {
        return request.getSession().getJobseeker();
    }

    public Job.Id getJobId(HttpRequest request) {
        String jobIdString = request.getParameter("jobId");
        return new Job.Id(Integer.parseInt(jobIdString));
    }

    public ResumeAction getResumeAction(HttpRequest request) {
        ResumeAction action = ResumeAction.NONE;

        if ("existing".equals(request.getParameter("whichResume"))) {
            action = ResumeAction.LOAD_ACTIVE;
        } else {
            if ("yes".equals(request.getParameter("makeResumeActive"))) {
                action = ResumeAction.SAVE_AS_ACTIVE;
            }
        }

        return action;
    }
}
