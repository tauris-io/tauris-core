package io.tauris.engine;

/**
 * @author Ray Chaung
 */
public class TPluginInitException extends Exception {

    public TPluginInitException(String message, Throwable cause) {
        super(message, cause);
    }

    public TPluginInitException(String message) {
        super(message);
    }

    public TPluginInitException(Throwable cause) {
        super(cause);
    }
}
