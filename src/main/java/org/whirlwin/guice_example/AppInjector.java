package org.whirlwin.guice_example;

import com.google.inject.AbstractModule;

public final class AppInjector extends AbstractModule {

    @Override
    protected void configure() {
        bind(PersonRegisterService.class).to(PersonRegisterServiceImpl.class);
    }
}
