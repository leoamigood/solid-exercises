package com.theladders.solid.isp.oldjob;

/**
 * User: Leo Amigood <lamigud@theladders.com>
 * Date: 7/24/13
 * Time: 1:42 PM
 */
public interface JobBenefitInfo
{
    /**
     * Get this job's compensation (text).
     *
     * @return compensation for this job.
     */
    String getCompensation();

    /**
     * Get this job's compensationSalary (text).
     *
     * @return compensationSalary for this job.
     */
    String getCompensationSalary();

    /**
     * Get this job's compensationBonus (text).
     *
     * @return compensationBonus for this job.
     */
    String getCompensationBonus();

    /**
     * Get this job's compensationOther (text).
     *
     * @return compensationOther for this job.
     */
    String getCompensationOther();
}
