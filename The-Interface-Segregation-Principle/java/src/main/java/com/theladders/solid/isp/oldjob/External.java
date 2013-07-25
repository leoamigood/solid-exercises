package com.theladders.solid.isp.oldjob;

/**
 * User: Leo Amigood <lamigud@theladders.com>
 * Date: 7/24/13
 * Time: 2:54 PM
 */
public interface External
{
    /**
     * Get the URL for this job. This is only valid for external (harvested) jobs (! isJobReq).
     *
     * @return URL for this job.
     */
    String getUrl();
}
