 package com.dp.creational.f.abs_factory_prob;

//Represents an abstract instance of machine
public interface Instance {
    enum Capacity{micro, small, large}
    void attachStorage(Storage storage);
    void start();
    void stop();
}
