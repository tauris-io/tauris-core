package io.tauris.engine;

import java.util.Set;

/**
 * Class TPluginScanner
 *
 * @author Ray Chaung
 */
public interface TPluginScanner {

    Set<Class<? extends TPlugin>> scanPluginTypes();

    Set<Class<? extends TPlugin>> scanPluginClasses(Class<? extends TPlugin> pluginType);

}
