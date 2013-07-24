package com.theladders.solid.isp.oldjob;

import com.theladders.solid.isp.oldjob.stubs.JobStatus;

/**
 * User: Leo Amigood <lamigud@theladders.com>
 * Date: 7/24/13
 * Time: 1:53 PM
 */
public interface JobAppliable
{
    /**
     * Does the job have a particular status? There's a legacy thing where a job could have more than
     * one status, hence this method... Status should be moved out of PublicationInfo though, and this
     * should be a getStatus() method...
     *
     * @param status
     *          status to check against.
     * @return true if job has this status, false otherwise.
     */
    boolean hasStatus(JobStatus status);

    boolean isDeleted();

    boolean isExpired();

    /**
     * Is this job filled?
     *
     * @return true if this job is filled, false otherwise.
     */
    boolean isFilled();

    /**
     * Is this job a JobReq? JobReqs are jobs entered into our site directly by recruiters.
     *
     * @return true if job is a JobReq, false otherwise.
     */
    boolean isJobReq();

    /**
     * Is this job a Marketing job? If this flag is set, basic access is allowed to this job (where
     * otherwise it would be premium) from certain landing pages.
     *
     * @return true if this is marked for marketing, false otherwise.
     */
    // TODO: This should only ever be true for JobReq, refactor into the JobReq interface
    boolean isMarketing();
}
