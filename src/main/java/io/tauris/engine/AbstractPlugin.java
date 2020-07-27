package io.tauris.engine;

/**
 * @author Ray Chaung
 */
public class AbstractPlugin implements TPlugin {

    protected String id;

    @Override
    public String id() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
