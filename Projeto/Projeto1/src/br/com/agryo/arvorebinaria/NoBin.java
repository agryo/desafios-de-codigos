package br.com.agryo.arvorebinaria;

public class NoBin<T extends Comparable<T>> {
    private T conteudo;
    private NoBin<T> noEsquerdo;
    private NoBin<T> noDireito;

    public NoBin(T conteudo) {
        this.conteudo = conteudo;
        noEsquerdo = noDireito = null;
    }

    public NoBin(){
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoBin<T> getNoEsquerdo() {
        return noEsquerdo;
    }

    public void setNoEsquerdo(NoBin<T> noEsquerdo) {
        this.noEsquerdo = noEsquerdo;
    }

    public NoBin<T> getNoDireito() {
        return noDireito;
    }

    public void setNoDireito(NoBin<T> noDireito) {
        this.noDireito = noDireito;
    }

    @Override
    public String toString() {
        return "NoBin{" +
                "conteudo=" + conteudo +
                '}';
    }
}
