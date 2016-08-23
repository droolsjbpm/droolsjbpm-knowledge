/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.kie.internal.weaver;

import org.kie.api.KieBase;
import org.kie.api.definition.KiePackage;
import org.kie.api.io.ResourceType;
import org.kie.internal.io.ResourceTypePackage;
import org.kie.internal.utils.KieService;

public interface KieWeaverService<P extends ResourceTypePackage> extends KieService {

    ResourceType getResourceType();

    void merge(KieBase kieBase, KiePackage kiePkg, P rtPkg);

    void weave(KieBase kieBase, KiePackage kiePkg, P rtPkg);
}
