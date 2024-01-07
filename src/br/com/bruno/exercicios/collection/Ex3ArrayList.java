package br.com.bruno.exercicios.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Ex3ArrayList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        numbers.remove(2);

        int numbersSize = numbers.size();
        System.out.println(numbersSize);

        System.out.println(numbers.get(0));

        numbers.add(1, 10);

        Collections.sort(numbers);

        System.out.println(numbers);


    }
}
