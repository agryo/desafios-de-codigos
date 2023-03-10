package br.com.agryo.arvorebinaria;

import br.com.agryo.arvorebinaria.model.Obj;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();

        minhaArvore.inderir(new Obj(13));
        minhaArvore.inderir(new Obj(10));
        minhaArvore.inderir(new Obj(25));
        minhaArvore.inderir(new Obj(2));
        minhaArvore.inderir(new Obj(12));
        minhaArvore.inderir(new Obj(20));
        minhaArvore.inderir(new Obj(31));
        minhaArvore.inderir(new Obj(29));
        minhaArvore.inderir(new Obj(32));


        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPosOrdem();
    }
}
