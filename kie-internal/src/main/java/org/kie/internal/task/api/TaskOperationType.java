/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
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
package org.kie.internal.task.api;

import org.kie.internal.task.api.model.Operation;

public enum TaskOperationType {
    ADD_POT_OWNER,
    ADD_EXCL_OWNER,
    ADD_ADMIN,
    REMOVE_POT_OWNER,
    REMOVE_EXCL_OWNER,
    REMOVE_ADMIN,
    ARCHIVE,
    ADD_COMMENT,
    REMOVE_COMMENT,
    ADD_ATTACHMENT,
    REMOVE_ATTACHMENT,
    SAVE_CONTENT,
    CREATE,
    START,
    ACTIVATE,
    COMPLETE,
    STOP,
    EXIT,
    FAIL,
    CLAIM,
    SKIP,
    SUSPEND,
    FORWARD,
    RELEASE,
    RESUME,
    DELEGATE,
    NOMINATE,
    REMOVE, 
    UPDATE_DEADLINE,
    UNKNOWN;
    
    public static TaskOperationType from (Operation operation) {
        switch (operation) {
            case Activate: return ACTIVATE;
            case Claim: return CLAIM;
            case Complete: return COMPLETE;
            case Delegate: return DELEGATE;
            case Exit: return EXIT;
            case Fail: return FAIL;
            case Forward: return FORWARD;
            case Modify: return SAVE_CONTENT;
            case Nominate: return NOMINATE;
            case Release: return RELEASE;
            case Remove: return REMOVE;
            case Resume: return RESUME;
            case Skip: return SKIP;
            case Start: return START;
            case Stop: return STOP;
            case Suspend: return SUSPEND;
            default: return UNKNOWN;
        }
    }
}
