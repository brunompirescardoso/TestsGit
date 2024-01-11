package br.com.bruno.exercicios.collection.arrayList.ex4ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ex1ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.remove(3);

        int intSize = numbers.size();
        System.out.println(intSize);

        int specifiedNumber = numbers.get(0);
        System.out.println(specifiedNumber);

        numbers.add(0, 10);

        Collections.sort(numbers);





    }
}
