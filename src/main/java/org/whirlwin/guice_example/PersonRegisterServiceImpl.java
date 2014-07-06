package org.whirlwin.guice_example;

import java.util.Arrays;
import java.util.List;
import javax.inject.Singleton;

@Singleton
public final class PersonRegisterServiceImpl implements PersonRegisterService {

    @Override
    public List<String> getPeople() {
        return Arrays.asList(
                "John",
                "Jane",
                "Joe"
        );
    }
}
