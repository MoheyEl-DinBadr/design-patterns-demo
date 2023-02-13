package com.mohey.design.patterns.chain.responsability.pattern.model.impl;

import com.mohey.design.patterns.chain.responsability.pattern.model.Handler;

public class SuperUserHandler extends Handler {
    public SuperUserHandler() {
        super(0);
    }

    @Override
    public void handle(String data) {
        System.out.println("SuperUserHandler.handle");
    }
}
