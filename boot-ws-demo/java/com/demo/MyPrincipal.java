package com.demo;

import java.security.Principal;

public class MyPrincipal implements Principal {
    private String  Name;

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String getName() {
        return this.Name;
    }
}
