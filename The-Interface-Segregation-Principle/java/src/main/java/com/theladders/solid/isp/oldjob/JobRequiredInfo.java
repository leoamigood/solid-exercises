package com.theladders.solid.isp.oldjob;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import com.theladders.solid.isp.oldjob.stubs.JobFunction;
import com.theladders.solid.isp.oldjob.stubs.PositionLevel;

public interface JobRequiredInfo extends Serializable
{
    /**
     * Get the date this job was originally published
     *
     * @return the Date the job was originally published
     */
    Date getOriginalPublicationDate();

    /**
     * Get the date this job was entered into the system.
     *
     * @return the Date the job was entered.
     */
    Date getEntryDate();

    /**
     * Get the date this job was published.
     *
     * @return the Date the job was published.
     */
    Date getPublicationDate();

    /**
     * Get this job's title.
     *
     * @return the title for this job.
     */
    String getTitle();

    PositionLevel getPositionLevel();

    /**
     * Get this job's short description.
     *
     * @return a summary description of this job.
     */
    String getShortDescription();

    /**
     * Refactored so it can be used by both job and JobReq
     * @return fullJobDescription()
     *
     */
    String getDescription();


    Collection<JobFunction> getJobFunctions();
}
