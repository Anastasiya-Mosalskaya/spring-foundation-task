package com.training.springtask.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Profile("qa")
public class QADataSourceConfig implements DataSourceConfig {

    @Override
    public Map<String, String> configure() {
        Map<String, String> properties = new HashMap<>();
        properties.put("Config_type", "QA");
        return properties;
    }
}
