package com.onix.mongoheartbeat.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.onix.mongoheartbeat.Settings;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MongoConfig {

    private final Settings settings;

    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create(this.settings.getMongoDb());
    }

}