package com.threshold.toolset.just4test.mock.db;

import com.navercorp.pinpoint.common.trace.TraceMetadataProvider;
import com.navercorp.pinpoint.common.trace.TraceMetadataSetupContext;

public class DBStreamReplayMetadataProvider implements TraceMetadataProvider {
    @Override
    public void setup(TraceMetadataSetupContext context) {
        context.addServiceType(DBStreamReplayConstants.SERVICE_TYPE);
    }
}
