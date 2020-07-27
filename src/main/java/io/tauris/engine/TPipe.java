package io.tauris.engine;

/**
 * Class TPipe
 *
 * @author Ray Chaung
 *
 */
public interface TPipe<T> {

    String getName();

    void put(T e) throws InterruptedException;


    default void open() throws Exception {
    }

    default void close() {
    }

    default void join(TPipe<T> pipe) {

    }
}
