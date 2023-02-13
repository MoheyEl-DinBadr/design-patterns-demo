package com.mohey.design.patterns.chain.responsability.pattern.model.impl;

import com.mohey.design.patterns.chain.responsability.pattern.model.Handler;

public class UserDataHandler extends Handler {
    public UserDataHandler() {
        super(5);
    }

    @Override
    public void handle(String data) {
        System.out.println("UserDataHandler.handle");
    }
}
