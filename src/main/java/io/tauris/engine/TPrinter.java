package io.tauris.engine;

import io.tauris.engine.annotations.Type;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Class TPrinter
 *
 * @author Ray Chaung
 */
@Type
public interface TPrinter extends TPlugin, Closeable {

    void write(TEvent event) throws IOException, EncodeException;

    void flush() throws IOException;
}
