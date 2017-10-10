package net.struwi.cdisandbox;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class SomeRequestBean {

    private String foo = "Request " + Math.random();

    public String getFoo() {
        return foo;
    }

}
