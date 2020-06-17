package com.parkk.web.proxy;

import org.springframework.stereotype.Component;

@FunctionalInterface
public interface IConsumer<T> {
    public void accept(T t);
}