package io.tauris.engine;

import io.tauris.engine.annotations.Type;

import java.io.OutputStream;

/**
 * Class TPrinterBuilder
 *
 * @author Ray Chaung
 *
 */
@Type
public interface TPrinterBuilder extends TPlugin {

    TPrinter create(OutputStream out);

}
