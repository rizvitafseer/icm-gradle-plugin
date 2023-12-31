/*
 * Copyright 2019 Intershop Communications AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.intershop.gradle.icm.extension

import org.gradle.api.Project
import org.gradle.api.model.ObjectFactory
import org.gradle.api.tasks.Internal
import javax.inject.Inject

/**
 * Extension to configure sub projects, like connectors,
 * payment provider etc.
 *
 * @property name only for internal use in a named container.
 * @constructor provides a sub project configuration.
 */
open class NamedCartridgeProject
    @Inject constructor(@Internal val name: String, project: Project, objectFactory: ObjectFactory):
    CartridgeProject(project, objectFactory)
