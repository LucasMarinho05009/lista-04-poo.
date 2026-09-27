package br.com.meusistema.main;

import br.com.meusistema.model.Carro;

public class Sistema {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.setModelo("Fusca");
        meuCarro.setCor("Azul");
        meuCarro.setVelocidade(-500);
        System.out.println("Velocidade após tentativa inválida: " + meuCarro.getVelocidade());
        meuCarro.setVelocidade(60);
        System.out.println("Velocidade válida: " + meuCarro.getVelocidade());
        meuCarro.buzinar();
    }
}
