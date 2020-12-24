/*-
 * #%L
 * Google Truth support for Pax Exam
 * %%
 * Copyright (C) 2020 Andreas Veithen
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.github.veithen.pax.truth;

import static org.ops4j.pax.exam.CoreOptions.bundle;

import org.ops4j.pax.exam.options.CompositeOption;
import org.ops4j.pax.exam.options.DefaultCompositeOption;

public final class TruthOptions {
    private TruthOptions() {}

    public static CompositeOption truthBundles() {
        return new DefaultCompositeOption(
                bundle("link:classpath:META-INF/links/com.google.guava.link"),
                bundle("link:classpath:META-INF/links/com.google.truth.link"),
                bundle("link:classpath:META-INF/links/checker-qual.link"),
                bundle("link:classpath:META-INF/links/org.jsr-305.link"),
                bundle("link:classpath:META-INF/links/com.google.guava.failureaccess.link"),
                bundle("link:classpath:META-INF/links/org.objectweb.asm.link"));
    }
}
