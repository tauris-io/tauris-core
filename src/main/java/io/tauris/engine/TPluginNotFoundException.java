package io.tauris.engine;

/**
 * Class TPluginNotFoundException
 *
 * @author Ray Chaung
 */
public class TPluginNotFoundException extends Exception {

    private String type;
    private String name;

    public TPluginNotFoundException(String type, String name) {
        super(String.format("plugin %s::%s not found", type, name));
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
