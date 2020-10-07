package com.company;

import java.util.Random;

public class Dau {
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void tirar() {
        Random random = new Random();
        valor = random.nextInt(6 + 1);
    }

    @Override
    public String toString() {
        return "Dau{" +
                "valor=" + valor +
                '}';
    }
}
