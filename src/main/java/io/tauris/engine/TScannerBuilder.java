package io.tauris.engine;

import io.tauris.engine.annotations.Type;

import java.io.InputStream;

@Type("scanner")
public interface TScannerBuilder extends TPlugin {

    TScanner create(InputStream in, TEventFactory factory);

}
