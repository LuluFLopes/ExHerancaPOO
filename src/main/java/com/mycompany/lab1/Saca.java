package com.mycompany.lab1;

/**
 *
 * @author luciano.flopes
 */
public class Saca {

    private Pessoa p;

    public void saca(Conta c, double valor, String nome) {
        p = new Pessoa(nome);
        if (verificaSaldo(valor, c)) {
            c.setSaldo(c.getSaldo() - valor);
            p.setSaldo(valor);
            System.out.println("O " + p.getNome() + " sacou: " + p.getSaldo());
        } else {
            System.out.println("Saldo insuficiente!");
        }

    }

    public boolean verificaSaldo(double valor, Conta c) {
        if (c.getSaldo() > valor) {
            return true;
        }
        return false;
    }

}
