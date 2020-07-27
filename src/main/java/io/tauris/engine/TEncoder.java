package io.tauris.engine;

import io.tauris.engine.annotations.Type;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Encode an event to String
 * @author Ray Chaung
 */
@Type
public interface TEncoder extends TPlugin {

    default void init() {}

    void encode(TEvent event, String target) throws EncodeException;

    String encode(TEvent event) throws EncodeException;

    void encode(TEvent event, OutputStream out) throws EncodeException, IOException;
}
