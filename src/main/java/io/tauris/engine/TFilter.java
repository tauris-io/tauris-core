package io.tauris.engine;

import io.tauris.engine.annotations.Type;

/**
 * @author Ray Chaung
 */
@Type("filter")
public interface TFilter extends TPlugin {

    default boolean test(TEvent event) { return true; }

    default void prepare() throws TPluginInitException {}

    TEvent filter(TEvent event);
}
