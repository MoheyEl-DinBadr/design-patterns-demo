package com.mohey.design.patterns.chain.responsability.pattern.model.impl.handler.chain;

import com.mohey.design.patterns.chain.responsability.pattern.model.Handler;
import com.mohey.design.patterns.chain.responsability.pattern.model.HandlerChain;

import java.util.PriorityQueue;

public class HandlerChainImpl implements HandlerChain {

    private final PriorityQueue<Handler<?>> priorityQueue = new PriorityQueue<>();
    @Override
    public void add(Handler<?> handler) {
        priorityQueue.offer(handler);
    }

    @Override
    public void handle(Object toHandle) {
        for (Handler handler : priorityQueue) {
            handler.handle(toHandle);
        }
    }


}
