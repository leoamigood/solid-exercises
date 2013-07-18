package com.theladders.solid.srp.job.application;

import com.theladders.solid.srp.job.Job;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: lamigud
 * Date: 7/18/13
 * Time: 9:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class JobApplicationModel {
    private Map<String, Object> model = new HashMap<>();

    public JobApplicationModel(JobApplicationResult application) {
        model.put("jobId", application.getJobId());
        model.put("jobTitle", application.getJobTitle());
    }

}
