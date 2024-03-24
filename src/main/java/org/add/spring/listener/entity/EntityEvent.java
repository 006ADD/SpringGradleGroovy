package org.add.spring.listener.entity;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;
import java.util.EventObject;

public class EntityEvent extends EventObject {
    private final AccessType accessType;
    //private final Object entity;

    public EntityEvent(AccessType accessType, Object entity) {
        super(entity);
        this.accessType = accessType;
    }

    public AccessType getAccessType() {
        return accessType;
    }
}
