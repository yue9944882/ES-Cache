package com.kimmin.es.plugin.tiny;

import com.kimmin.es.plugin.tiny.handler.ConfigHandler;
import org.elasticsearch.common.inject.AbstractModule;

/**
 * Created by kimmin on 3/8/16.
 */
public class TinyMonitorModule extends AbstractModule {

    @Override
    protected void configure(){
        /** Bind Component **/
        bind(TinyMonitorComponent.class).asEagerSingleton();

        /** Bind RESTful handler **/
        bind(ConfigHandler.class).asEagerSingleton();
    }

}