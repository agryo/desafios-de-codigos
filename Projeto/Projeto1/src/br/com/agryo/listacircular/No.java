package br.com.agryo.listacircular;

public class No<T> {
    private T conteudo;
    private No<T> priximoNo;

    public No(T conteudo){
        this.priximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getPriximoNo() {
        return priximoNo;
    }

    public void setPriximoNo(No<T> priximoNo) {
        this.priximoNo = priximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
