package com.nasa.explorer.factory;

import com.nasa.explorer.model.NasaData;

public interface NasaDataFactory {
    default NasaData criarDados() {
        return null;
    }
}