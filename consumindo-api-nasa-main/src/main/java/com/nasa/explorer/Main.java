package com.nasa.explorer;

import com.nasa.explorer.service.ApodService;
import com.nasa.explorer.service.MeteorService;
import com.nasa.explorer.service.AbstractNasaService;

public class Main {
    public static void main(String[] args) {
        AbstractNasaService apodService = new ApodService();
        apodService.processarDados();

        AbstractNasaService meteorService = new MeteorService();
        meteorService.processarDados();
    }
}