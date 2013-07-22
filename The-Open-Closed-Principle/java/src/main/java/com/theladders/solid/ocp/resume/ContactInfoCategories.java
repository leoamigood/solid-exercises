package com.theladders.solid.ocp.resume;

import com.theladders.solid.ocp.resume.category.*;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: lamigud
 * Date: 7/22/13
 * Time: 4:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class ContactInfoCategories extends ResumeCategories
{
    public Iterator<ResumeCategory> iterator()
    {
        return new HashSet<ResumeCategory>()
        {
            {
                add(new PhoneNumber());
                add(new EmailAddress());
                add(new MailingAddress());
                add(new ContactInfo());
            }
        }.iterator();
    }
}
