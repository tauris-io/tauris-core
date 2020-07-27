package io.tauris.engine;

/**
 * Class EncodeException
 *
 * @author Ray Chaung
 *
 */
public class EncodeException extends Exception {

    public EncodeException(String message, Throwable cause) {
        super(message, cause);
    }

    public EncodeException(String message) {
        super(message);
    }

    public EncodeException(Throwable cause) {
        super(cause);
    }
}
