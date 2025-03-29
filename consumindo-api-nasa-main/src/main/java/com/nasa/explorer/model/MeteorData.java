package com.nasa.explorer.model;

public class MeteorData implements com.nasa.explorer.model.NasaData {
    private MeteorData() {
    }

    @Override
    public void exibirInfo() {
        System.out.println("Dados sobre Meteoros");
    }
}