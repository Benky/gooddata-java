/**
 * Copyright (C) 2004-2016, GoodData(R) Corporation. All rights reserved.
 */
package com.gooddata.project;

/**
 * Optional property for project or warehouse create, the property is ignored during update.
 * Default value is {@link #PRODUCTION} which is also environment for all currently existing projects or warehouses.
 */
public enum Environment {
    /** Default value, projects or warehouses are backed-up and archived. */
    PRODUCTION,
    /** no meaning yet and behavior is the same as for {@link #PRODUCTION} projects or warehouses. */
    DEVELOPMENT,
    /** 'TESTING' projects or warehouses are not backed-up and archived. */
    TESTING
}
