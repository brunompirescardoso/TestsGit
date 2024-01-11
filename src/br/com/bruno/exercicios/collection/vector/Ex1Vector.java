package br.com.bruno.exercicios.collection.vector;

import java.util.Vector;

public class Ex1Vector {
    public static void main(String[] args) {
        //   1 - Declare um vetor e imprima de 1 a 5
        Vector<Integer> vetor = new Vector<Integer>();
        vetor.add(1);
        vetor.add(2);
        vetor.add(3);
        vetor.add(4);
        vetor.add(5);

        for(Integer i: vetor){
            System.out.println(i);
        }


    }
}
