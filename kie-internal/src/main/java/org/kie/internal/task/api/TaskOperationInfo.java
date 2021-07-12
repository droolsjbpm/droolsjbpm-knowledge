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

import java.util.Arrays;

import org.kie.api.task.model.Task;

public class TaskOperationInfo {
    
    private Task task;
    private TaskOperationType type;
    private String userId;
    private String[] targetEntities;
    
    
    public static TaskOperationInfo forCreate (Task task, String userId) {
        return new TaskOperationInfo(task, TaskOperationType.CREATE, userId);
    }
    
    public static TaskOperationInfo forUpdate (Task task, String userId, TaskOperationType type, String... targetEntities) {
        return new TaskOperationInfo(task, type, userId, targetEntities);
    }
    
    public static TaskOperationInfo forRemove (Task task, String userId) {
        return new TaskOperationInfo(task, TaskOperationType.REMOVE, userId);
    }

    private TaskOperationInfo(Task task, TaskOperationType type, String userId, String... targetEntities) {
        this.task = task;
        this.type = type;
        this.userId = userId;
        this.targetEntities = targetEntities;
    }

    public String[] getTargetEntities() {
        return targetEntities;
    }

    public TaskOperationType getType() {
        return type;
    }

    public String getUserId() {
        return userId;
    }

    public Task getTask() {
        return task;
    }

    @Override
    public String toString() {
        return "TaskOperationInfo [task=" + task + ", type=" + type + ", userId=" + userId + ", targetEntities=" +
               Arrays.toString(targetEntities) + "]";
    }
    
    
}
