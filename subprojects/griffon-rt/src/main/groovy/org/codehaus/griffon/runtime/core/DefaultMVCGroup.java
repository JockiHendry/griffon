/*
 * Copyright 2009-2014 the original author or authors.
 *
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
 */

package org.codehaus.griffon.runtime.core;

import griffon.core.GriffonApplication;
import griffon.core.MVCGroupConfiguration;

import java.util.Map;

/**
 * Default implementation of the {@code MVCGroup} interface
 *
 * @author Andres Almiray
 * @since 0.9.3
 */
public class DefaultMVCGroup extends AbstractMVCGroup {
    public DefaultMVCGroup(GriffonApplication app, MVCGroupConfiguration configuration, String mvcId, Map<String, Object> members) {
        super(app, configuration, mvcId, members);
    }

    public String toString() {
        return super.toString() + "[" + getMvcType() + ":" + getMvcId() + "]";
    }
}
