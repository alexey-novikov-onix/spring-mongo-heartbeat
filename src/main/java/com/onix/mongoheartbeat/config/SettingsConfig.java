package com.onix.mongoheartbeat.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.onix.mongoheartbeat.Settings;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class SettingsConfig {

    private final ObjectMapper objectMapper;

    @SneakyThrows
    @Bean
    public Settings settings(@Value("${config-location}") final String configLocation) {
        final Settings settings = this.objectMapper.readValue(ResourceUtils.getFile(configLocation), Settings.class);
        log.info("Application settings: {}", settings);
        return settings;
    }

}
