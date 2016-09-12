/**
 * Copyright (C) 2004-2016, GoodData(R) Corporation. All rights reserved.
 */
package com.gooddata.report;

import com.gooddata.GoodDataException;

/**
 * Exception during report export
 */
public class ReportException extends GoodDataException {
    public ReportException(String message) {
        super(message);
    }

    public ReportException(String message, Throwable cause) {
        super(message, cause);
    }
}
