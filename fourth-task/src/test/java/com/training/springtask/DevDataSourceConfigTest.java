package com.training.springtask;

import com.training.springtask.config.DataSourceConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("dev")
@SpringBootTest
public class DevDataSourceConfigTest {

    @Autowired
    private DataSourceConfig dataSourceConfig;

    @Test
    public void testThatDevConfigIsApplied() {
        Map<String, String> properties = dataSourceConfig.configure();
        assertEquals("DEV", properties.get("Config_type"));
    }
}
