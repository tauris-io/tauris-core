package io.tauris.engine;

/**
 * Class DefaultEventFactory
 *
 * @author Ray Chaung
 *
 */
public class DefaultEventFactory implements TEventFactory {

    @Override
    public String getName() {
        return "default";
    }

    @Override
    public TEvent create() {
        return new DefaultEvent();
    }

    @Override
    public TEvent create(String source) {
        return new DefaultEvent(source);
    }
}
