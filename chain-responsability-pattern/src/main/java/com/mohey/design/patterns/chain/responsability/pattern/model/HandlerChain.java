package com.mohey.design.patterns.chain.responsability.pattern.model;

public interface HandlerChain {
    void add(Handler<?> handler);

    void handle(Object toHandle);
}
