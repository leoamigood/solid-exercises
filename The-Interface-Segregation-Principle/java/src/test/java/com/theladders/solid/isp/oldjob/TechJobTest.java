package com.theladders.solid.isp.oldjob;

import com.theladders.solid.isp.oldjob.stubs.Discipline;
import com.theladders.solid.isp.oldjob.stubs.Experience;
import com.theladders.solid.isp.oldjob.stubs.PositionLevel;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * User: Leo Amigood <lamigud@theladders.com>
 * Date: 7/25/13
 * Time: 10:43 AM
 */
public class TechJobTest
{

    @Test
    public void testTechJob()
    {
        TechJob job = new TechJob(new Date(), new PositionLevel(), "job description", "job summary", new JobPreRequisiteInfo()
        {
            public Experience getExperience()
            {
                return new Experience();
            }

            public List<Discipline> getDisciplines()
            {
                return new ArrayList<Discipline>() {{ add(new Discipline()); }};
            }
        });

        assertNotNull(job);
        assertEquals("job description", job.getDescription());
        assertEquals(1, job.getDisciplines().size());
    }

}
