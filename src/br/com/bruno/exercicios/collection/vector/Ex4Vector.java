package br.com.bruno.exercicios.collection.vector;
import java.util.Vector;
import java.util.Collections;
public class Ex4Vector {
    public static void main(String[] args) {
        //   4 - Declare um vetor e ordene os valores contidos
        Vector<Integer> vetor = new Vector<Integer>();
        vetor.add(100);
        vetor.add(1000);
        vetor.add(1);
        vetor.add(10);

        Collections.sort(vetor);
        System.out.println(vetor);
    }
}
