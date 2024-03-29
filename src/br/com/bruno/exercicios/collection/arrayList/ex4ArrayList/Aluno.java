package br.com.bruno.exercicios.collection.arrayList.ex4ArrayList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Nota> notas = new ArrayList<Nota>();


    public Aluno(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.notas.toString().toString();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNotas(double nota) {
        this.notas.add(new Nota(nota));
    }

    public double getNotas(int index) {
        return this.notas.get(index).getValor();
    }

    public void removeNotas(int index){
        this.notas.remove(index);
    }

    public int tamanhoNotas(){
        return this.notas.size();
    }

    public void ordenaNotas(){
        Collections.sort(notas);
    }

}
