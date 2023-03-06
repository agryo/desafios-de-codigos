package br.com.agryo.listaduplamenteencadeada;

public class NoDuplo<T> {
    private T conteudo;
    private NoDuplo<T> noDepois;
    private NoDuplo<T> noAntes;

    public NoDuplo(T conteudo){
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoDepois() {
        return noDepois;
    }

    public void setNoDepois(NoDuplo<T> noDepois) {
        this.noDepois = noDepois;
    }

    public NoDuplo<T> getNoAntes() {
        return noAntes;
    }

    public void setNoAntes(NoDuplo<T> noAntes) {
        this.noAntes = noAntes;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
