/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.example;

import static org.junit.Assert.assertTrue;

import org.dspace.AbstractIntegrationTest;
import org.dspace.example.impl.ExampleImpl;
import org.dspace.utils.DSpace;
import org.junit.Test;

public class ExampleIT extends AbstractIntegrationTest {

    @Test
    public void testExampleImpl() {
        assertTrue(new DSpace().getSingletonService(Example.class) instanceof ExampleImpl);
    }
}
