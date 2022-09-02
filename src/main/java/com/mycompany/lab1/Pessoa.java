package com.mycompany.lab1;

/**
 *
 * @author luciano.flopes
 */
public class Pessoa {

    private String nome;
    private double saldo;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
