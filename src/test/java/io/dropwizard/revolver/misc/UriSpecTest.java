/*
 * Copyright 2016 Phaneesh Nagaraja <phaneesh.n@gmail.com>.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package io.dropwizard.revolver.misc;

import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;

/**
 * @author phaneesh
 */
public class UriSpecTest {

    @Test
    public void testFullUri() throws URISyntaxException {
        URI uri = new URI("http://test.com:80/hello/test?num=0");
        assertEquals("http", uri.getScheme());
        assertEquals(80, uri.getPort());
        assertEquals("test.com", uri.getHost());
    }

    @Test
    public void testUriWithNoPort() throws URISyntaxException {
        URI uri = new URI("http://test.com/hello/test?num=0");
        assertEquals("http", uri.getScheme());
        assertEquals(-1, uri.getPort());
        assertEquals("test.com", uri.getHost());
    }
}
