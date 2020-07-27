package io.tauris.engine;

import java.util.Set;

/**
 * @author Ray Chaung
 */
public interface TPluginFactory {

    default TPlugin newInstance(String pluginName) {
        return newInstance(pluginName, "default");
    };

    TPlugin newInstance(String pluginName, String minorName);

    Set<Class<? extends TPlugin>> getPluginClasses();
}
