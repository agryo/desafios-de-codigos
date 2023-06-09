package br.com.agryo.filafifo;

public class Fila<T> {
    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }


    /*
    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }*/
    public void enqueue(T obj){
        No<T> novoNo = new No(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first(){
        if (!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }
    /* //Forma ruim de fazer
    public No first(){
        if (!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }*/

    public T dequeue(){
        if (!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No<T> noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null){
            while (true){
                stringRetorno += noAuxiliar.getObject() + " ---> ";
                if (noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else {
                    stringRetorno += "| Balcão";
                    break;
                }
            }
        }else {
            stringRetorno = "Vago";
        }
        return stringRetorno;
    }
}
