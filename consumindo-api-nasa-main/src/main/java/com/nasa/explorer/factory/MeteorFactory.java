package com.nasa.explorer.factory;

import com.nasa.explorer.model.MeteorData; // Certifique-se de que MeteorData está implementando NasaData
import com.nasa.explorer.model.NasaData;

public class MeteorFactory implements NasaDataFactory {
    private MeteorFactory() {
    }

    public static MeteorFactory createMeteorFactory() {
        return new MeteorFactory();
    }

    @Override
    public NasaData criarDados() {
        return new NasaData() {
            @Override
            public void exibirInfo() {

            }
        }; /* Instanciando MeteorData, que deve implementar NasaData */
    }
}