package com.theladders.solid.isp.oldjob;

import java.util.Date;
import java.util.List;

import com.theladders.solid.isp.oldjob.stubs.*;

public interface JobCommon
{
    /**
     * @return the name of the company
     */
    String getCompany();

    /**
     * Gets the value of the company_size_id field.
     * This represents the id in the company size table for the description of
     * how large the company is.
     *
     * @return companySize
     */
    Integer getCompanySize();

    /**
     * Get the Industry for this job.
     *
     * @return the Industry for this job.
     */
    Industry getIndustry();

    /**
     * Get the sector for this job.
     *
     * @return the sector for this job.
     */
    Sector getSector();

    /**
     * Get the "reportsTo" field.
     *
     * @return reportsTo
     */
    String getReportsTo();

    /**
     * @return returns true if this job was posted anonymously
     */
    boolean isAnonymous();

    boolean isConfidential();

    boolean isExclusive();

    boolean isReimbursable();
}
