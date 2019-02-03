package com.threshold.toolset.just4test.mock.db;

import com.navercorp.pinpoint.common.trace.ServiceType;
import com.navercorp.pinpoint.common.trace.ServiceTypeFactory;

public class DBStreamReplayConstants {
    private DBStreamReplayConstants() {
    }

    public static final String SCOPE = "DBCP_SCOPE";

    public static final ServiceType SERVICE_TYPE = ServiceTypeFactory.of(6051, "DBCP");

    public static final String ACCESSOR_DATASOURCE_MONITOR = "com.navercorp.pinpoint.plugin.commons.dbcp.DataSourceMonitorAccessor";

    public static final String INTERCEPTOR_CONSTRUCTOR = "com.navercorp.pinpoint.plugin.commons.dbcp.interceptor.DataSourceConstructorInterceptor";
    public static final String INTERCEPTOR_CLOSE = "com.navercorp.pinpoint.plugin.commons.dbcp.interceptor.DataSourceCloseInterceptor";

    public static final String INTERCEPTOR_GET_CONNECTION = "com.navercorp.pinpoint.plugin.commons.dbcp.interceptor.DataSourceGetConnectionInterceptor";
    public static final String INTERCEPTOR_CLOSE_CONNECTION = "com.navercorp.pinpoint.plugin.commons.dbcp.interceptor.DataSourceCloseConnectionInterceptor";

}
