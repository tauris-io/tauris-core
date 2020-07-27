package io.tauris.engine;

import io.tauris.engine.annotations.Type;

/**
 * @author Ray Chaung
 */
@Type("output")
public interface TOutput extends TPlugin {

    default void start() throws Exception {}

    default boolean write(TEvent event) {
        return false;
    };

    default void stop() {
        this.release();
    };

}
