package com.onix.mongoheartbeat.service;

import com.onix.mongoheartbeat.document.Entry;
import com.onix.mongoheartbeat.repository.EntryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public final class EntryService {

    private final EntryRepository entryRepository;

    public void save(final String instanceId) {
        final Entry entry = this.entryRepository.findById(instanceId)
                .orElseGet(Entry::new);

        entry.setInstanceId(instanceId);
        entry.setLastHeartbeat(new Date());

        this.entryRepository.save(entry);
    }

}
