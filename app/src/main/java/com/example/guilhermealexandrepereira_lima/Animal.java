package com.example.guilhermealexandrepereira_lima;

import java.io.Serializable;

public class Animal  implements Serializable {
    private String nomeAnimal;
    private int imagemAnimal;
    private String palavraAnimal;
    private PoderHabilidade poder;

    public Animal(String nomeAnimal, int imagemAnimal, String palavraAnimal) {
        this.nomeAnimal = nomeAnimal;
        this.imagemAnimal = imagemAnimal;
        this.palavraAnimal = palavraAnimal;
    }
    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public int getImagem() {
        return imagemAnimal;
    }

    public String getPalavraAnimal() {
        return palavraAnimal;
    }


   public PoderHabilidade getPoder( int ValorNome, int ValorPalavra) {
        int valor =  ValorNome + ValorPalavra;
        return ;
    }

    public void setPoder(PoderHabilidade poder) {
        this.poder = poder;
    }
}
