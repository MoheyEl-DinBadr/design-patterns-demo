package com.mohey.design.patterns.chain.responsability.pattern.model.impl.handler;

import com.mohey.design.patterns.chain.responsability.pattern.model.Handler;

import java.util.function.Predicate;

public class UserDataHandler extends Handler<String> {

    private static final Predicate<Object> predicate = obj -> {

        if (obj instanceof String str)
            return "User".equalsIgnoreCase(str);

        return false;
    };
    public UserDataHandler() {
        super(5, predicate);
    }

    @Override
    public void __handle(String data) {
        System.out.println("UserDataHandler.handle");
    }
}
