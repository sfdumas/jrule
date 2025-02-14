/**
 * Copyright (c) 2010-2022 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.automation.jrule.rules.value;

import java.time.ZonedDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * The {@link JRuleDateTimeValueTest}
 *
 * @author Robert Delbrück - Initial contribution
 */
class JRuleDateTimeValueTest {

    @Test
    void asStringValue() {
        JRuleDateTimeValue value = new JRuleDateTimeValue(ZonedDateTime.now());
        String string = value.stringValue();
        JRuleDateTimeValue fromString = new JRuleDateTimeValue(string);
        Assertions.assertEquals(value, fromString);
    }
}
