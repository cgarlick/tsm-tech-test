package com.travelsupermarket.applicants.test;


import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;


public class AppApplication extends Application<AppConfiguration> {

    public static void main(String[] args) throws Exception {
        new AppApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<AppConfiguration> bootstrap) {

    }

    @Override
    public void run(AppConfiguration configuration, Environment environment) throws Exception {

    }
}
