package io.tauris.engine;

import io.tauris.engine.annotations.Type;

/**
 * Created by zhanglei on 2019/3/13.
 */
@Type(name = "formatter")
public interface TFormatter extends TPlugin {

    String format(TEvent event);

}
