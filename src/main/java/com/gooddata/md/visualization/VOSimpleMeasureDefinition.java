/*
 * Copyright (C) 2018, GoodData(R) Corporation. All rights reserved.
 * This source code is licensed under the BSD-style license found in the
 * LICENSE.txt file in the root directory of this source tree.
 */
package com.gooddata.md.visualization;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.gooddata.executeafm.ObjQualifier;
import com.gooddata.executeafm.afm.FilterItem;

import java.util.List;

import static com.gooddata.md.visualization.VOSimpleMeasureDefinition.NAME;

/**
 * Simple measure definition to be used within {@link Measure}
 * @deprecated identical with {@link com.gooddata.executeafm.afm.MeasureDefinition}, see https://github.com/gooddata/gooddata-java/issues/581
 */
@Deprecated
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(NAME)
public class VOSimpleMeasureDefinition extends com.gooddata.executeafm.afm.SimpleMeasureDefinition {

    private static final long serialVersionUID = 8467311354259963694L;
    public static final String NAME = "measureDefinition";

    /**
     * Creates instance of simple measure definition to be used in {@link VisualizationObject}
     * @param item uri to measure
     * @param aggregation used aggregation function
     * @param computeRatio indicates if result should be calculated in percents
     * @param filters filters by which measure is filtered
     */
    @JsonCreator
    public VOSimpleMeasureDefinition(@JsonProperty("item") final ObjQualifier item,
                                     @JsonProperty("aggregation") final String aggregation,
                                     @JsonProperty("computeRatio") final Boolean computeRatio,
                                     @JsonProperty("filters") final List<FilterItem> filters) {
        super(item, aggregation, computeRatio, filters);
    }
}
