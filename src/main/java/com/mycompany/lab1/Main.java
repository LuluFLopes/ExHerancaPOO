package com.mycompany.lab1;

/**
 *
 * @author luciano.flopes
 */
public class Main {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("Lucats", 111, 1111);
        ContaPoupanca cp = new ContaPoupanca("Stevart", 222, 2222);
        
        // Depositando valores nas contas.
        cc.deposita(400.0, cc);
        cp.deposita(500.0, cp);
        
        cc.transfere(100.00, cc, cp);
        
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }
}
