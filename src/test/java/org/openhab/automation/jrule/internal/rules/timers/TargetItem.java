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
package org.openhab.automation.jrule.internal.rules.timers;

import java.util.List;
import java.util.Map;

import org.openhab.automation.jrule.internal.items.JRuleInternalStringItem;
import org.openhab.automation.jrule.items.metadata.JRuleItemMetadata;

/**
 * Simple dummy item used in testcase (would normally be generated from item definition)
 *
 * @author Arne Seime - Initial contribution
 */
public class TargetItem extends JRuleInternalStringItem {

    public TargetItem(String itemName, String label, String type, String id, Map<String, JRuleItemMetadata> metadata,
            List<String> tags) {
        super(itemName, label, type, id, metadata, tags);
    }

    @Override
    public String getLabel() {
        return "label";
    }

    @Override
    public String getType() {
        return "STRING";
    }

    @Override
    public String getId() {
        return getId();
    }
}
