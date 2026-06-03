package com.Carros.entity;

public class Carro {
    public int ano;
    public String modelo;
    public String marca;

    public void exibir() {
        System.out.println(marca + " " + modelo + " " + ano);
    }

    public static void exibeCarros(Carro[] carros, int total) {
        System.out.println("Carros cadastrados");
        for (int i = 0; i < total; i++) {
            carros[i].exibir();
        }
    }
}
