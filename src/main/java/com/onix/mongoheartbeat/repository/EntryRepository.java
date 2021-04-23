package com.onix.mongoheartbeat.repository;

import com.onix.mongoheartbeat.document.Entry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EntryRepository extends MongoRepository<Entry, String> {

}
