package com.faisonsle.toolset.just4test.mock.db;

import com.navercorp.pinpoint.bootstrap.instrument.transformer.TransformTemplate;
import com.navercorp.pinpoint.bootstrap.instrument.transformer.TransformTemplateAware;
import com.navercorp.pinpoint.bootstrap.logging.PLogger;
import com.navercorp.pinpoint.bootstrap.logging.PLoggerFactory;
import com.navercorp.pinpoint.bootstrap.plugin.ProfilerPlugin;
import com.navercorp.pinpoint.bootstrap.plugin.ProfilerPluginSetupContext;

public class DBStreamReplay implements ProfilerPlugin, TransformTemplateAware {
    private final PLogger logger = PLoggerFactory.getLogger(this.getClass());
    private DBStreamReplayProfilerConfig config;
    private TransformTemplate transformTemplate;

    @Override
    public void setup(ProfilerPluginSetupContext context) {
        config = new DBStreamReplayProfilerConfig(context.getConfig());
        if (!config.isPluginEnable()) {
            logger.info("Disable commons dbcp option. 'profiler.jdbc.dbcp=false'");
            return;
        }

        addBasicDataSourceTransformer();
//        if (config.isProfileClose()) {
//            addPoolGuardConnectionWrapperTransformer();
//        }
    }

    @Override
    public void setTransformTemplate(TransformTemplate transformTemplate) {
        this.transformTemplate = transformTemplate;
    }

    private void addBasicDataSourceTransformer() {
    }
}
