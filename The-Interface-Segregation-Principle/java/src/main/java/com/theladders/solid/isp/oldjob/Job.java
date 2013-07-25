package com.theladders.solid.isp.oldjob;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import com.theladders.solid.isp.oldjob.stubs.*;

public abstract class Job implements JobRequiredInfo
{
    private Date originalPublicationDate;
    private Date entryDate;
    private Date publicationDate;
    private String title;
    private PositionLevel positionLevel;
    private String description;
    private String shortDescription;
    private Collection<JobFunction> jobFunctions;

    public Date getOriginalPublicationDate()
    {
        return originalPublicationDate;
    }

    public void setOriginalPublicationDate(Date originalPublicationDate)
    {
        this.originalPublicationDate = originalPublicationDate;
    }

    public Date getEntryDate()
    {
        return entryDate;
    }

    public void setEntryDate(Date entryDate)
    {
        this.entryDate = entryDate;
    }

    public Date getPublicationDate()
    {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate)
    {
        this.publicationDate = publicationDate;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public PositionLevel getPositionLevel()
    {
        return positionLevel;
    }

    public void setPositionLevel(PositionLevel positionLevel)
    {
        this.positionLevel = positionLevel;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getShortDescription()
    {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription)
    {
        this.shortDescription = shortDescription;
    }

    public Collection<JobFunction> getJobFunctions()
    {
        return jobFunctions;
    }

    public void setJobFunctions(Collection<JobFunction> jobFunctions)
    {
        this.jobFunctions = jobFunctions;
    }
}
