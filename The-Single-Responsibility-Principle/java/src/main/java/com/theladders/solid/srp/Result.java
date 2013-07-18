package com.theladders.solid.srp;

import com.theladders.solid.srp.job.application.JobApplicationModel;

import java.util.List;
import java.util.Map;

public class Result {
    public static final String SUCCESS = "success";
    public static final String ERROR = "error";
    public static final String INCOMPLETE = "completeResumePlease";
    public static final String INVALID_JOB = "invalidJob";

    private final String type;
    private final JobApplicationModel model;
    private final List<String> errorList;

    public Result(String type, JobApplicationModel model) {
        this.type = type;
        this.model = model;
        this.errorList = null;
    }

    public Result(String type, JobApplicationModel model, List<String> errList) {
        this.type = type;
        this.model = model;
        this.errorList = errList;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Result [type=" + type + ", model=" + model + ", errorList=" + errorList + "]";
    }
}
