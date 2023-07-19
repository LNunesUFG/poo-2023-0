package com.ufg.poo.t09.circuloponto;

public class Circulo {
    double raio;
    Ponto centro;

    void transladar(double dx, double dy) {
        this.centro.x = dx;
        this.centro.y = dy;
    }
}
