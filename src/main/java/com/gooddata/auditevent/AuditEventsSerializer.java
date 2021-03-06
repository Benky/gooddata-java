/*
 * Copyright (C) 2004-2017, GoodData(R) Corporation. All rights reserved.
 * This source code is licensed under the BSD-style license found in the
 * LICENSE.txt file in the root directory of this source tree.
 */
package com.gooddata.auditevent;

import com.gooddata.collections.PageableListSerializer;

class AuditEventsSerializer extends PageableListSerializer {

    public AuditEventsSerializer() {
        super(AuditEvents.ROOT_NODE);
    }
}
