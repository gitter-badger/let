/*
 * Copyright (C) 2015 Can Elmas
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
 */

package com.canelmas.let;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Bind a field to the specified string resource ID.
 *
 * <pre><code>
 * {@literal @}AskPermission(Manifest.permission.ACCESS_FINE_LOCATION)
 * void getLocationAndDoSomething(){};
 * </code></pre>
 *
 * <pre><code>
 * {@literal @}AskPermission({
 *     Manifest.permission.READ_CONTACTS,
 *     Manifest.permission.CALL_PHONE,
 * })
 * void deepDiveIntoTheApp(){};
 * </code></pre>
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface AskPermission {

    /* Permission name */
    String[] value() default "";

}
