package com.mohey.design.patterns.chain.responsability.pattern.model.impl.handler;

import com.mohey.design.patterns.chain.responsability.pattern.model.Handler;

import java.util.function.Predicate;

public class AdminDataHandler extends Handler<String> {

    private static final Predicate<Object> predicate = obj -> {

        if (obj instanceof String str)
            return "Admin".equalsIgnoreCase(str);

        return false;
    };
    public AdminDataHandler() {
        super(1, predicate);
    }

    @Override
    protected void __handle(String data) {
        System.out.println("AdminDataHandler.handle");
    }
}
