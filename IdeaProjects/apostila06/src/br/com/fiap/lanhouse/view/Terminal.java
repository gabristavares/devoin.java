package br.com.fiap.lanhouse.view;

import br.com.fiap.lanhouse.model.Computador;

public class Terminal {


    public static void main(String[] args){
        Computador pc = new Computador("intel i7", 1,
                "RTX 5060", 512, false,12);

        //Criar um novo objeto Computador
        Computador pichau = new Computador("i9", 1);

        pc.setProcessador("Intel i7");
        pc.setArmazenamento(512);
        pc.setMemoriaram(12);
        pc.setId(1);
        pc.setPlacadevideo("RTX 5060");
        pc.setSsd(false);
    }
}
