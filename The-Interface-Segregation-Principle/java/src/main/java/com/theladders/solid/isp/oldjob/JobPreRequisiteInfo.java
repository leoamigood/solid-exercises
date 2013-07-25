package com.theladders.solid.isp.oldjob;

import com.theladders.solid.isp.oldjob.stubs.Discipline;
import com.theladders.solid.isp.oldjob.stubs.Experience;

import java.util.List;

/**
 * User: Leo Amigood <lamigud@theladders.com>
 * Date: 7/24/13
 * Time: 1:46 PM
 */
public interface JobPreRequisiteInfo
{
    /**
     * Returns an object that represents the number of years of experience
     * that are required for this job.
     * @return experience object
     */
    Experience getExperience();

    /**
     * Retrieves a list of disciplines for this job.
     *
     * @return List of Disciplines
     */
    List<Discipline> getDisciplines();
}
