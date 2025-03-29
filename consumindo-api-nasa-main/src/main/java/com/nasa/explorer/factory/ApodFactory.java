package com.nasa.explorer.factory;

import com.nasa.explorer.model.ApodData;
import com.nasa.explorer.model.NasaData;

public class ApodFactory implements NasaDataFactory {
    @Override
    public NasaData criarDados() {
        return new ApodData();
    }
}