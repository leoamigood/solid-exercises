package com.theladders.solid.isp.oldjob;

import com.theladders.solid.isp.oldjob.stubs.City;
import com.theladders.solid.isp.oldjob.stubs.Region;

/**
 * User: Leo Amigood <lamigud@theladders.com>
 * Date: 7/24/13
 * Time: 1:23 PM
 */
public interface LocationAware
{
    String getLocation();

    /**
     * Get the City for this job.
     *
     * @return the City for this job.
     */
    City getCity();

    /**
     * Get the region for this job.
     *
     * @return the region for this job.
     */
    Region getRegion();

}
