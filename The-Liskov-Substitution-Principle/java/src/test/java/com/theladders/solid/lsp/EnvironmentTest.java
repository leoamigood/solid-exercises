package com.theladders.solid.lsp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Leo Amigood <lamigud@theladders.com>
 * Date: 7/23/13
 * Time: 4:42 PM
 */
public class EnvironmentTest
{
    Environment environment;

    @Before
    public void setUp()
    {
        environment = new Environment();
    }

    @Test
    public void testAdminEmail()
    {
        environment.put("admin", "lamigud");
        environment.put(Environment.KEY_EMAIL_DOMAIN, "theladders.com");
        assertEquals("lamigud@theladders.com", environment.getAdminEmail());
        assertEquals(2, environment.size());
    }

    @Test
    public void testEmptyAdminEmail()
    {
        assertEquals("", environment.getAdminEmail());
        assertEquals(0, environment.size());
    }

    @Test
    public void testPartialAdminEmail()
    {
        environment.put("admin", "lamigud");
        assertEquals("", environment.getAdminEmail());
        assertEquals(1, environment.size());
    }

    @Test
    public void testPartialOtherAdminEmail()
    {
        environment.put("other", "lamigud");
        assertEquals("", environment.getAdminEmail());
        assertEquals(1, environment.size());
    }

}
