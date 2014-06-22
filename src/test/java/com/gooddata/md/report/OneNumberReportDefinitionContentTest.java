/*
 * Copyright (C) 2007-2014, GoodData(R) Corporation. All rights reserved.
 */
package com.gooddata.md.report;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import java.io.InputStream;
import java.util.Collections;

import static com.gooddata.JsonMatchers.serializesToJson;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class OneNumberReportDefinitionContentTest {

    @Test
    public void testDeserialization() throws Exception {
        final InputStream is = getClass().getResourceAsStream("/md/report/oneNumberReportDefinitionContent.json");
        final OneNumberReportDefinitionContent def = (OneNumberReportDefinitionContent) new ObjectMapper()
                .readValue(is, ReportDefinitionContent.class);
        assertThat(def, is(notNullValue()));
        assertThat(def.getFormat(), is("oneNumber"));
        assertThat(def.getGrid(), is(notNullValue()));
    }

    @Test
    public void testSerialization() throws Exception {
        final OneNumberReportDefinitionContent def = new OneNumberReportDefinitionContent(
                new Grid(Collections.<String>emptyList(), Collections.<AttributeInGrid>emptyList(),
                        Collections.<GridElement>emptyList()), "desc"
        );
        assertThat(def, serializesToJson("/md/report/oneNumberReportDefinitionContent-input.json"));
    }

}