package com.theladders.solid.isp.oldjob;

/**
 * User: Leo Amigood <lamigud@theladders.com>
 * Date: 7/24/13
 * Time: 1:34 PM
 */
public interface JobIdentifiable
{
    /**
     * Returns a unique identifier for this job. In the web application, this currently maps to
     * job_location_id in the Database. Scripts may use other values.
     *
     * @return unique identifier for this job.
     */
    int getJobId();

    /**
     * Return the jobsite id for this job.
     *
     * @return jobsite id for this job.
     */
    int getJobSiteId();

    /**
     * Returns the real job_id.
     *
     * @return job id
     */
    Integer getParentJobId();

    int getOldJobId();

    int getSubscriberId();


}
