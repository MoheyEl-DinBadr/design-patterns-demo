package com.mohey.design.patterns.chain.responsability.pattern;

import com.mohey.design.patterns.chain.responsability.pattern.model.Handler;
import com.mohey.design.patterns.chain.responsability.pattern.model.impl.AdminDataHandler;
import com.mohey.design.patterns.chain.responsability.pattern.model.impl.SuperUserHandler;
import com.mohey.design.patterns.chain.responsability.pattern.model.impl.UserDataHandler;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Handler> handlers = new PriorityQueue<>();


        var adminDataHandler = new AdminDataHandler();
        var adminDataHandler2 = new AdminDataHandler();
        var userDataHandler = new UserDataHandler();
        var superUserHandler = new SuperUserHandler();

        handlers.offer(userDataHandler);
        handlers.offer(adminDataHandler2);
        handlers.offer(superUserHandler);
        handlers.offer(adminDataHandler);


        for (Handler handler: handlers) {
            handler.handle("Dummy Data");
        }

    }
}
