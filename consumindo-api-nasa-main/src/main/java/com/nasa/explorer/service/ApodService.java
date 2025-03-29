// ApodService.java
package com.nasa.explorer.service;

import com.nasa.explorer.factory.ApodFactory;

public class ApodService extends AbstractNasaService {
    public ApodService() {
        super(new ApodFactory());
    }
}