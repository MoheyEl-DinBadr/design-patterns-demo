package com.mohey.design.patterns.chain.responsability.pattern;

import com.mohey.design.patterns.chain.responsability.pattern.model.Handler;
import com.mohey.design.patterns.chain.responsability.pattern.model.impl.handler.AdminDataHandler;
import com.mohey.design.patterns.chain.responsability.pattern.model.impl.handler.LoggerHandler;
import com.mohey.design.patterns.chain.responsability.pattern.model.impl.handler.SuperUserHandler;
import com.mohey.design.patterns.chain.responsability.pattern.model.impl.handler.UserDataHandler;
import com.mohey.design.patterns.chain.responsability.pattern.model.impl.handler.chain.HandlerChainImpl;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        var  handlers = new HandlerChainImpl();


        var loggerHandler = new LoggerHandler();

        var adminDataHandler = new AdminDataHandler();
        var adminDataHandler2 = new AdminDataHandler();
        var userDataHandler = new UserDataHandler();
        var superUserHandler = new SuperUserHandler();

        handlers.add(loggerHandler);
        handlers.add(userDataHandler);
        handlers.add(adminDataHandler2);
        handlers.add(superUserHandler);
        handlers.add(adminDataHandler);


        handlers.handle("Test");

    }
}
