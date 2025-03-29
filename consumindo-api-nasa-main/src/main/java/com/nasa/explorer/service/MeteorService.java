// MeteorService.java
package com.nasa.explorer.service;

import com.nasa.explorer.factory.MeteorFactory;

public class MeteorService extends AbstractNasaService {
    public MeteorService() {
        super(MeteorFactory.createMeteorFactory());
    }
}