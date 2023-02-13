package com.mohey.design.patterns.chain.responsability.pattern.model.impl.handler;

import com.mohey.design.patterns.chain.responsability.pattern.model.Handler;

import java.util.function.Predicate;

public class SuperUserHandler extends Handler<String> {

    private static final Predicate<Object> predicate = obj -> {

        if (obj instanceof String str)
            return "SuperUser".equalsIgnoreCase(str);

        return false;
    };
    public SuperUserHandler() {
        super(0, predicate);
    }

    @Override
    protected void __handle(String data) {
        System.out.println("SuperUserHandler.handle");
    }
}
