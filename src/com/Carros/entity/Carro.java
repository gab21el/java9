package com.Carros.entity;

public class Carro {
    public int ano;
    public String modelo;
    public String marca;
    public double valor;

    public void exibir() {
        System.out.println(marca + " " + modelo + " " + ano + " --" +" R$"+ valor);
    }

    public static void exibeCarros(Carro[] carros, int total) {
        int cont = 0;
        double soma = 0;
        System.out.println("Carros cadastrados");
        for (int i = 0; i < total; i++) {
            carros[i].exibir();
            soma += carros[i].valor;
            cont++;
        }
        System.out.println("A soma total é: " + soma);
        System.out.println("O número de carros cadastrados é: " + cont);
    }
}
