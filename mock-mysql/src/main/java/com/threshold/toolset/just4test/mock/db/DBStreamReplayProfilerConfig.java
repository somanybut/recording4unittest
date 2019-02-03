package com.threshold.toolset.just4test.mock.db;

import com.navercorp.pinpoint.bootstrap.config.ProfilerConfig;

public class DBStreamReplayProfilerConfig {

    static final String DBCP_PLUGIN_ENABLE = "profiler.jdbc.dbcp";
    static final String DBCP_PROFILE_CONNECTIONCLOSE_ENABLE = "profiler.jdbc.dbcp.connectionclose";

    private final boolean pluginEnable;
    private final boolean profileClose;

    public DBStreamReplayProfilerConfig(ProfilerConfig config) {
        pluginEnable = config.readBoolean(DBCP_PLUGIN_ENABLE, false);
        profileClose = config.readBoolean(DBCP_PROFILE_CONNECTIONCLOSE_ENABLE, false);
    }

    public boolean isPluginEnable() {
        return pluginEnable;
    }

    public boolean isProfileClose() {
        return profileClose;
    }
}
