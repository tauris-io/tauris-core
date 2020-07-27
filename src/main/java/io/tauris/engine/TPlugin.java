package io.tauris.engine;

/**
 * @author Ray Chaung
 */
public interface TPlugin {

    default String id() {
        return null;
    }

    default void setId(String id)  {}

    /**
     * Release resource
     */
    default void release() {}
}
