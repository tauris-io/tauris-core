package io.tauris.engine;

/**
 * Class TEventFactory
 *
 * @author Ray Chaung
 *
 */
public interface TEventFactory {

    String getName();

    TEvent create();

    TEvent create(String source);

}
