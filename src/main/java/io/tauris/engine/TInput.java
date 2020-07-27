package io.tauris.engine;

import io.tauris.engine.annotations.Type;

/**
 * @author Ray Chaung
 */
@Type("input")
public interface TInput extends TPlugin {

    void init(TPipe<TEvent> queue, TEventFactory factory);

    void run() throws Exception ;

    void close();

}
