package com.mohey.design.patterns.chain.responsability.pattern.model;


import java.util.function.Predicate;

public abstract class Handler<T> implements Comparable<Handler<?>>{

    private int priority = 0;
    private final Predicate<Object> predicate;

    protected Handler(int priority, Predicate<Object> predicate) {
        this.priority = priority;
        this.predicate = predicate;
    }

    private boolean isCorrectHandler(Object toHandle) {
        return predicate.test(toHandle);
    }

    @Override
    public int compareTo(Handler<?> handler) {
        return Integer.compare(this.priority, handler.priority);
    }

    protected abstract void __handle(T toHandle);

    public void handle(T toHandle) {
        if (isCorrectHandler(toHandle))
            __handle(toHandle);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Handler<?> handler)) return false;

        return priority == handler.priority;
    }

    @Override
    public int hashCode() {
        return priority;
    }
}
