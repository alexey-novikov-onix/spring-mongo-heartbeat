package com.onix.mongoheartbeat.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Document
public final class Entry {

    @Id
    private String instanceId;
    private Date lastHeartbeat;

}
