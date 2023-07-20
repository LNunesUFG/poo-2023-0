package br.ufg.inf.t09.ponto;

public class Circulo {
    double raio;
    Ponto centro;

    void transladar(double dx, double dy) {
        this.centro.x = dx;
        this.centro.y = dy;
    }
}
