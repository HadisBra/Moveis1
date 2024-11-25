package com.example.guilhermealexandrepereira_lima;

public class PoderHabilidade {
    private String nomeAnimal;
    private String palavraAnimal;
    private int podertotal;

    public PoderHabilidade(String nomeAnimal, String palavraAnimal) {
        this.nomeAnimal = nomeAnimal;
        this.palavraAnimal = palavraAnimal;
    }



    public int ValorNome() {
        int valorNome = 0;
        for (char c : nomeAnimal.toLowerCase().toCharArray()) {
            switch (c) {
                case 'a': valorNome += 10; break;
                case 'e': valorNome += 20; break;
                case 'i': valorNome += 30; break;
                case 'o': valorNome += 40; break;
                case 'u': valorNome += 50; break;
            }
        }
        return valorNome;
    }

    public int ValorPalavra() {
        int valorPalavra = 0;
        for (char c : palavraAnimal.toLowerCase().toCharArray()) {
            switch (c) {
                case 'b':
                    valorPalavra += 1;
                    break;
                case 'c':
                    valorPalavra += 2;
                    break;
                case 'd':
                    valorPalavra += 3;
                    break;
                case 'f':
                    valorPalavra += 4;
                    break;
                case 'g':
                    valorPalavra += 5;
                    break;
                case 'h':
                    valorPalavra += 6;
                    break;
                case 'j':
                    valorPalavra += 7;
                    break;
                case 'k':
                    valorPalavra += 8;
                    break;
                case 'l':
                    valorPalavra += 9;
                    break;
                case 'm':
                    valorPalavra += 10;
                    break;
                case 'n':
                    valorPalavra += 11;
                    break;
                case 'p':
                    valorPalavra += 12;
                    break;
                case 'q':
                    valorPalavra += 13;
                    break;
                case 'r':
                    valorPalavra += 14;
                    break;
                case 's':
                    valorPalavra += 15;
                    break;
                case 't':
                    valorPalavra += 16;
                    break;
                case 'v':
                    valorPalavra += 17;
                    break;
                case 'w':
                    valorPalavra += 18;
                    break;
                case 'x':
                    valorPalavra += 19;
                    break;
                case 'y':
                    valorPalavra += 20;
                    break;
                case 'z':
                    valorPalavra += 21;
                    break;


            }
        }
        return valorPalavra;
    }

    public void setPodertotal(int podertotal) {
        this.podertotal = podertotal;
    }

    public int ValorTotal() {
       podertotal = ValorNome() + ValorPalavra();
        return  podertotal;
    }

}
