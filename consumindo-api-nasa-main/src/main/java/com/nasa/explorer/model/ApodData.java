package com.nasa.explorer.model;

public class ApodData implements com.nasa.explorer.model.NasaData {
    @Override
    public void exibirInfo() {
        System.out.println("Dados da Imagem Astronômica do Dia (APOD)");
    }
}