package com.onix.mongoheartbeat.service;

import com.onix.mongoheartbeat.Settings;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public final class HeartbeatSchedulerService {

    private final Settings settings;
    private final EntryService entryService;

    @Scheduled(fixedRateString = "#{@settings.getHeartBeatInSec() * 1000}")
    public void schedule() {
        log.info("Save entry...");
        this.entryService.save(this.settings.getInstanceId());
    }

}
