package br.com.agryo.listaduplamenteencadeada;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoDepois(null);
        novoNo.setNoAntes(ultimoNo);
        if (primeiroNo == null){
            primeiroNo = novoNo;
        }
        if (ultimoNo != null){
            ultimoNo.setNoDepois(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoDepois(noAuxiliar);
        if (novoNo.getNoDepois() != null){
            novoNo.setNoAntes(noAuxiliar.getNoAntes());
            novoNo.getNoDepois().setNoAntes(novoNo);
        }else {
            novoNo.setNoAntes(ultimoNo);
            ultimoNo = novoNo;
        }
        if (index == 0){ primeiroNo = novoNo; }
        else { novoNo.getNoAntes().setNoDepois(novoNo); }
        tamanhoLista++;
    }

    public void remove(int index){
        if (index == 0){
            primeiroNo = primeiroNo.getNoDepois();
            if (primeiroNo != null){
                primeiroNo.setNoAntes(null);
            }
        }else {
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoAntes().setNoDepois(noAuxiliar.getNoDepois());
            if (noAuxiliar != ultimoNo){
                noAuxiliar.getNoDepois().setNoAntes(noAuxiliar.getNoAntes());
            }else {
                ultimoNo = noAuxiliar;
            }
        }
        this.tamanhoLista--;
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoDepois();
        }
        return noAuxiliar;
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0; i < size(); i++){
            strRetorno += "No{conteúdo= " + noAuxiliar.getConteudo() + "}]---> ";
            noAuxiliar = noAuxiliar.getNoDepois();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
