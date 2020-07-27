package io.tauris.engine;


import java.io.IOException;
import java.util.function.Function;

/**
 * Class TScanner
 *
 * @author Ray Chaung
 *
 */
public interface TScanner extends AutoCloseable {

    void scan(Function<TEvent, Boolean> consumer) throws IOException, DecodeException;

    void close() throws IOException;
    
}
