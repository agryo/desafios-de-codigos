package br.com.agryo.arvorebinaria;
public class ArvoreBinaria<T extends Comparable<T>> {
    private NoBin<T> raiz;
    public ArvoreBinaria(){
        this.raiz = null;
    }
    public void inderir(T conteudo){
        NoBin<T> novoNo = new NoBin<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }
    private NoBin<T> inserir(NoBin<T> noAtual, NoBin<T> novoNo){
        if (noAtual == null){
            return novoNo;
        }else if (novoNo.getConteudo().compareTo(noAtual.getConteudo()) < 0){
            noAtual.setNoEsquerdo(inserir(noAtual.getNoEsquerdo(), novoNo));
        }else {
            noAtual.setNoDireito(inserir(noAtual.getNoDireito(), novoNo));
        }
        return noAtual;
    }

    public void exibirInOrdem(){
        System.out.println("\nExibindo InOrdem");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(NoBin<T> noAtual){
        if (noAtual != null){
            exibirInOrdem(noAtual.getNoEsquerdo());
            System.out.println(noAtual.getConteudo() + ", ");
            exibirInOrdem(noAtual.getNoDireito());
        }
    }

    public void exibirPosOrdem(){
        System.out.println("\nExibindo PosOrdem");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(NoBin<T> noAtual){
        if (noAtual != null){
            exibirPosOrdem(noAtual.getNoEsquerdo());
            exibirPosOrdem(noAtual.getNoDireito());
            System.out.println(noAtual.getConteudo() + ", ");
        }
    }

    public void exibirPreOrdem(){
        System.out.println("\nExibindo PreOrdem");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(NoBin<T> noAtual){
        if (noAtual != null){
            System.out.println(noAtual.getConteudo() + ", ");
            exibirPreOrdem(noAtual.getNoEsquerdo());
            exibirPreOrdem(noAtual.getNoDireito());
        }
    }
}
