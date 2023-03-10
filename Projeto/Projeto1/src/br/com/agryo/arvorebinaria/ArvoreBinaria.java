package br.com.agryo.arvorebinaria;

import java.util.concurrent.ConcurrentNavigableMap;

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
            System.out.print(noAtual.getConteudo() + ", ");
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
            System.out.print(noAtual.getConteudo() + ", ");
        }
    }

    public void exibirPreOrdem(){
        System.out.println("\nExibindo PreOrdem");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(NoBin<T> noAtual){
        if (noAtual != null){
            System.out.print(noAtual.getConteudo() + ", ");
            exibirPreOrdem(noAtual.getNoEsquerdo());
            exibirPreOrdem(noAtual.getNoDireito());
        }
    }

    public void remover(T conteudo){
        try {
            NoBin<T> noAtual = this.raiz;
            NoBin<T> noPai = null;
            NoBin<T> noFilho = null;
            NoBin<T> noTemp = null;
            while (noAtual != null && !noAtual.getConteudo().equals(conteudo)){
                noPai = noAtual;
                if (conteudo.compareTo(noAtual.getConteudo()) < 0){
                    noAtual = noAtual.getNoEsquerdo();
                }else {
                    noAtual = noAtual.getNoDireito();
                }
            }
            if (noAtual == null){
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }
            if (noPai == null){
                if (noAtual.getNoDireito() == null){
                    this.raiz = noAtual.getNoEsquerdo();
                }else if (noAtual.getNoEsquerdo() == null){
                    this.raiz = noAtual.getNoDireito();
                }else {
                    for ( noTemp = noAtual, noFilho = noAtual.getNoEsquerdo();
                          noFilho.getNoDireito() != null;
                          noTemp = noFilho, noFilho = noFilho.getNoEsquerdo()
                    ){
                        if (noFilho != noAtual.getNoEsquerdo()){
                            noTemp.setNoDireito(noFilho.getNoEsquerdo());
                            noFilho.setNoEsquerdo(raiz.getNoEsquerdo());
                        }
                    }
                    noFilho.setNoDireito(raiz.getNoDireito());
                    raiz = noFilho;
                }
            }else if (noAtual.getNoDireito() == null){
                if (noPai.getNoEsquerdo() == noAtual){
                    noPai.setNoEsquerdo(noAtual.getNoEsquerdo());
                }else {
                    noPai.setNoDireito(noAtual.getNoEsquerdo());
                }
            }else if (noAtual.getNoEsquerdo() == null){
                if (noPai.getNoEsquerdo() == noAtual){
                    noPai.setNoEsquerdo(noAtual.getNoDireito());
                }else {
                    noPai.setNoDireito(noAtual.getNoDireito());
                }
            }else {
                for ( noTemp = noAtual, noFilho = noAtual.getNoEsquerdo();
                      noFilho.getNoEsquerdo() != null;
                      noTemp = noFilho, noFilho.getNoDireito()
                ){
                    if (noFilho != noAtual.getNoEsquerdo()){
                        noTemp.setNoDireito(noFilho.getNoEsquerdo());
                        noFilho.setNoEsquerdo(noAtual.getNoEsquerdo());
                    }
                    noFilho.setNoDireito(noAtual.getNoDireito());
                    if (noPai.getNoEsquerdo() == noAtual){
                        noPai.setNoEsquerdo(noFilho);
                    }else {
                        noPai.setNoDireito(noFilho);
                    }
                }
            }

        }catch (NullPointerException erro){
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }
    }
}
