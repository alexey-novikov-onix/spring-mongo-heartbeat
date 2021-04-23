package com.onix.mongoheartbeat;

import lombok.Value;

@Value
public class Settings {

    String instanceId;
    String mongoDb;
    int heartBeatInSec;
    int httpPort;

}
