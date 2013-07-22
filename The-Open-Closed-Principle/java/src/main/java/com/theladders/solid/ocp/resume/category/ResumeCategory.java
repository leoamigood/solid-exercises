package com.theladders.solid.ocp.resume.category;

public abstract class ResumeCategory
{
    @SuppressWarnings("unused")
    private int id;

    public ResumeCategory(int id)
    {
        this.id = id;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResumeCategory that = (ResumeCategory) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        return id;
    }
}
