package br.com.bruno.exercicios.collection.arrayList.ex4ArrayList;

public class Nota implements Comparable<Nota>{
    private double valor;

    public Nota(double valor){
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    @Override
    public int compareTo(Nota outraNota) {
        return (int) (this.getValor() - outraNota.getValor());
    }
}
