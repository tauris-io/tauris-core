package io.tauris.engine;

import javax.annotation.Nullable;

/**
 * Class PluginName
 *
 * @author Ray Chaung
 */
class PluginName {

    private String name;
    private String  minor;
    private boolean preferred;

    public PluginName(String name) {
        this.name = name;
    }

    public PluginName(String name, @Nullable String minor, boolean preferred) {
        this.name = name;
        this.minor = minor;
        this.preferred = preferred;
    }

    public String getName() {
        return name;
    }

    public String getMinor() {
        return minor;
    }

    public boolean isPreferred() {
        return preferred;
    }
}
