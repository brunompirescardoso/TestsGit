package br.com.bruno.exercicios.collection;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class Ex2ArrayList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("João");
        names.add("Maria");
        names.add("Pedro");
        names.add("Ana");

        names.remove("João");

        int size = names.size();
        System.out.println(size);

        String position = names.get(0);
        System.out.println(position);

        names.add(1, "José");

        Collections.sort(names);
        System.out.println(names);
    }
}
