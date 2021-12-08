package com.kawa;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/rest")
public class ApplicationEntry extends Application {

    private Set<Object> singletons = new HashSet<>();

    public ApplicationEntry() {
        singletons.add(new UserService());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
