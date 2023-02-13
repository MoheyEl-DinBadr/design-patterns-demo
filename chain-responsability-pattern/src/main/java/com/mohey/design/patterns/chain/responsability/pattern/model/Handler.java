package com.mohey.design.patterns.chain.responsability.pattern.model;


public abstract class Handler implements Comparable<Handler>{

    private int priority = 0;

    protected Handler(int priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Handler handler) {
        return Integer.compare(this.priority, handler.priority);
    }

    public abstract void handle(String data);

}
