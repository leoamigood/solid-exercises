package com.theladders.solid.srp.http;

import com.theladders.solid.srp.Result;
import com.theladders.solid.srp.job.application.ApplicationFailureException;
import com.theladders.solid.srp.job.application.JobApplicationModel;
import com.theladders.solid.srp.job.application.JobApplicationResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HttpResponse {
    private Result result;

    public String getResultType() {
        return result.getType();
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public void setResult(JobApplicationResult application) {
        JobApplicationModel model = new JobApplicationModel(application);
        switch (application.getStatus()) {
            case SUCCESS:
                result = new Result(Result.SUCCESS, model);
                break;

            case INCOMPLETE:
                result = new Result(Result.INCOMPLETE, model);
                break;

            case INVALID:
                result = new Result(Result.INVALID_JOB, model);
                break;

            case FAILURE:
                List<String> errors = new ArrayList<String>() {{ add("We could not process your application."); }};
                result = new Result(Result.ERROR, model, errors);
                break;

            default:
                throw new ApplicationFailureException(Result.ERROR);
        }
    }
}
