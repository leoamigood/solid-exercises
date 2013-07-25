package com.theladders.solid.isp.oldjob;

import java.util.Date;

/**
 * User: Leo Amigood <lamigud@theladders.com>
 * Date: 7/24/13
 * Time: 3:00 PM
 */
public interface Searchable
{
    /**
     * @return The last time this job was updated
     */
    Date getUpdateTime();
}
