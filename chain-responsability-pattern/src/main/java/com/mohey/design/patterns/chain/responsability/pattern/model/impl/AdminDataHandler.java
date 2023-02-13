package com.mohey.design.patterns.chain.responsability.pattern.model.impl;

import com.mohey.design.patterns.chain.responsability.pattern.model.Handler;

public class AdminDataHandler extends Handler {
    public AdminDataHandler() {
        super(1);
    }

    @Override
    public void handle(String data) {
        System.out.println("AdminDataHandler.handle");
    }
}
