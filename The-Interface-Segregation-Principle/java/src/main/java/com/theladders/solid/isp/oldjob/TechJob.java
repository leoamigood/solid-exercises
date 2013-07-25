package com.theladders.solid.isp.oldjob;

import com.theladders.solid.isp.oldjob.stubs.Discipline;
import com.theladders.solid.isp.oldjob.stubs.Experience;
import com.theladders.solid.isp.oldjob.stubs.PositionLevel;

import java.util.Date;
import java.util.List;

/**
 * User: Leo Amigood <lamigud@theladders.com>
 * Date: 7/25/13
 * Time: 10:20 AM
 */
public class TechJob extends Job implements JobPreRequisiteInfo
{
    JobPreRequisiteInfo requirements;

    public TechJob(Date published,
                   PositionLevel position,
                   String description,
                   String summary,
                   JobPreRequisiteInfo requirements)
    {
        super.setPublicationDate(published);
        super.setPositionLevel(position);
        super.setDescription(description);
        super.setShortDescription(summary);

        this.requirements = requirements;
    }


    public Experience getExperience()
    {
        return requirements.getExperience();
    }

    public List<Discipline> getDisciplines()
    {
        return requirements.getDisciplines();
    }
}
