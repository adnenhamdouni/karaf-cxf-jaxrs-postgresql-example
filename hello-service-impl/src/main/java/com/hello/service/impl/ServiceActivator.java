package com.hello.service.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ServiceActivator implements BundleActivator {

    public void start(BundleContext context) {
        System.out.println("Starting the hello-service-impl bundle");
    }

    public void stop(BundleContext context) {
        System.out.println("Stopping the hello-service-impl bundle");
    }

}