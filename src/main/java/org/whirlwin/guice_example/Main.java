package org.whirlwin.guice_example;

import javax.inject.Inject;

import com.google.inject.Guice;
import com.google.inject.Injector;

public final class Main {

    private static final Injector injector = Guice.createInjector(new AppInjector());
    private static final Main main = injector.getInstance(Main.class);

    private final PersonRegisterService personRegisterService;

    @Inject
    public Main(final PersonRegisterService personRegisterService) {
        this.personRegisterService = personRegisterService;
    }

    public void printAllPeople() {
        System.out.println(personRegisterService.getPeople());
    }

    public static void main(final String[] args) {
        main.printAllPeople();
    }
}
