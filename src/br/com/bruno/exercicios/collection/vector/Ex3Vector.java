package br.com.bruno.exercicios.collection.vector;

import java.util.Vector;

public class Ex3Vector {
    public static void main(String[] args) {
        //   3 - Declare um vetor e some os valores contidos
        Vector<Double> vetor = new Vector<Double>();
        vetor.add(1.0);
        vetor.add(2.0);
        vetor.add(3.0);

        double soma = 0;
        for(Double d: vetor){
            soma += d;
        }
        System.out.println(soma);
    }
}
