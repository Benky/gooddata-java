/**
 * Copyright (C) 2004-2016, GoodData(R) Corporation. All rights reserved.
 * This source code is licensed under the BSD-style license found in the
 * LICENSE.txt file in the root directory of this source tree.
 */
package com.gooddata.connector;

import com.gooddata.JsonMatchers;
import org.joda.time.DateTime;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class Zendesk4ProcessExecutionTest {

    @Test
    public void testShouldSerialize() throws Exception {
        assertThat(new Zendesk4ProcessExecution(), JsonMatchers.serializesToJson(
                "/connector/process-execution-empty.json"));
    }

    @Test
    public void testShouldSerializeIncremental() throws Exception {
        final Zendesk4ProcessExecution execution = new Zendesk4ProcessExecution();
        execution.setIncremental(true);
        assertThat(execution, JsonMatchers.serializesToJson(
                "/connector/process-execution-incremental.json"));
    }

    @Test
    public void testShouldSerializeStartTimes() throws Exception {
        final Zendesk4ProcessExecution execution = new Zendesk4ProcessExecution();
        execution.setIncremental(true);
        execution.setStartTime("tickets", new DateTime(0L));
        assertThat(execution, JsonMatchers.serializesToJson(
                "/connector/process-execution-startDate.json"));
    }
}