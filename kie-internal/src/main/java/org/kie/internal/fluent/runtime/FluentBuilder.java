/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.internal.fluent.runtime;

import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.Executable;
import org.kie.internal.fluent.ContextFluent;

public interface FluentBuilder extends TimeFluent<FluentBuilder>, ContextFluent<FluentBuilder, FluentBuilder> {

    KieContainerFluent getKieContainer(ReleaseId releaseId);

    Executable getExecutable();

    static FluentBuilder create() {
        try {
            return (FluentBuilder) Class.forName( "org.drools.core.fluent.impl.FluentBuilderImpl" ).newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Unable to instance ExecutableRunner", e);
        }
    }
}
