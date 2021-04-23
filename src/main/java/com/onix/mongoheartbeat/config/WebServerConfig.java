package com.onix.mongoheartbeat.config;

import com.onix.mongoheartbeat.Settings;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class WebServerConfig implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

    private final Settings settings;

    public void customize(final ConfigurableServletWebServerFactory factory){
        factory.setPort(this.settings.getHttpPort());
    }
}