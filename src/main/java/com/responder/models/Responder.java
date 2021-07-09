package com.responder.models;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Responder {
    private final String ID;
    private final String Name;
    private final String Description;
    private final boolean isSecurityCleared;
}
