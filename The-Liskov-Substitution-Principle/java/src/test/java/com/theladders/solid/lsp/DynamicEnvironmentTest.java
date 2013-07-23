package com.theladders.solid.lsp;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * User: Leo Amigood <lamigud@theladders.com>
 * Date: 7/23/13
 * Time: 4:54 PM
 */
public class DynamicEnvironmentTest
{
    //what about default constructor?
    DynamicEnvironment environment;

    @Test
    public void testPutAndGet()
    {
        environment = new DynamicEnvironment(new Environment(), new HashMap<String, String>());
        environment.put("key", "value");
        assertEquals("value", environment.get("key"));
    }

    @Test
    public void testReplace()
    {
        environment = new DynamicEnvironment(new Environment(), new HashMap<String, String>());
        environment.put("key", "original");
        assertEquals("original", environment.get("key"));

        environment.put("key", "replace");
        assertEquals("replace", environment.get("key"));
    }

    @Test
    public void testValuesNewEnvironment()
    {
        environment = new DynamicEnvironment(new Environment(), new HashMap<String, String>());
        environment.put("key", "original");
        assertTrue(environment.values().contains("original"));
        assertEquals(1, environment.values().size());
    }

    @Test
    public void testValuesExistingEnvironment()
    {
        Environment existing = new Environment(){{ put("existingKey", "existingValue"); }};
        environment = new DynamicEnvironment(existing, new HashMap<String, String>());
        assertTrue(environment.values().contains("existingValue"));
        assertEquals(1, environment.values().size());

        environment.put("key", "original");
        assertTrue(environment.values().contains("original"));
        assertEquals(2, environment.values().size());

        environment.put("existingKey", "replacingValue");
        assertTrue(environment.values().contains("replacingValue"));
        assertEquals(2, environment.values().size());
    }

}
