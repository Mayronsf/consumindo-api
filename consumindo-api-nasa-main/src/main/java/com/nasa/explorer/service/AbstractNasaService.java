package com.nasa.explorer.service;

import com.nasa.explorer.factory.NasaDataFactory;
import com.nasa.explorer.model.NasaData;

public abstract class AbstractNasaService {
    protected final NasaDataFactory factory;

    public AbstractNasaService(NasaDataFactory factory) {
        this.factory = factory;
    }

    public void processarDados() {
        NasaData data = factory.criarDados();
        data.exibirInfo();
    }
}