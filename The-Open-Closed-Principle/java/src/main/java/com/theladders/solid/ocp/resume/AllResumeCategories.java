package com.theladders.solid.ocp.resume;

import com.theladders.solid.ocp.resume.category.*;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: lamigud
 * Date: 7/22/13
 * Time: 4:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class AllResumeCategories extends ResumeCategories
{
    public Iterator<ResumeCategory> iterator()
    {
        return new HashSet<ResumeCategory>()
        {
            {
                add(new NameCategory());
                add(new PhoneNumber());
                add(new MailingAddress());
                add(new ContactInfo());
                add(new CompanyName());
                add(new WorkExperience());
            }
        }.iterator();
    }
}
