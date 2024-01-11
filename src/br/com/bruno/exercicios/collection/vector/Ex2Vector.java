package br.com.bruno.exercicios.collection.vector;

import java.util.Vector;

public class Ex2Vector {
    public static void main(String[] args) {
        //   2 - Declare um vetor e imprima os nomes de 10 países
        Vector<String> vetor = new Vector<String>();
        vetor.add("Brasil");
        vetor.add("Inglaterra");
        vetor.add("França");
        vetor.add("Alemanha");
        vetor.add("Italia");
        vetor.add("Argentina");
        vetor.add("Uruguai");
        vetor.add("Espanha");
        vetor.add("Portugal");
        vetor.add("México");

        for(String s: vetor){
            System.out.println(s);
        }
    }
}
