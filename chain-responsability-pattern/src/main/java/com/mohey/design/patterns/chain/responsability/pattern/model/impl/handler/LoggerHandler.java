package com.mohey.design.patterns.chain.responsability.pattern.model.impl.handler;

import com.mohey.design.patterns.chain.responsability.pattern.model.Handler;

public class LoggerHandler extends Handler<Object> {
    public LoggerHandler() {
        super(9, obj -> true);
    }

    @Override
    protected void __handle(Object toHandle) {
        System.out.println("toHandle.toString() = " + toHandle.toString());
    }
}
